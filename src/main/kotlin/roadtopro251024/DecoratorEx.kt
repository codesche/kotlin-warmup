package roadtopro251024

import kotlin.system.measureTimeMillis

/**
 * 구현 교체 없이 캐시를 활용하여 성능 개선하기
 */

// Domain
data class UserProfile(val id: Long, val name: String)

// Repository
interface UserProfileRepository {
    fun find(id: Long): UserProfile
}

// Adapter 1: 느린 외부 API라고 가정
class ApiUserProfileRepository : UserProfileRepository {
    override fun find(id: Long): UserProfile {
        Thread.sleep(200)       // IO 지연 시뮬레이션
        return UserProfile(id, "User$id")
    }
}

// Adapter 2: 데코레이더 캐시 - Repository 에서 캐시 활용
class CachingUserProfileRepository(
    private val origin: UserProfileRepository
) : UserProfileRepository {
    private val cache = mutableMapOf<Long, UserProfile>()
    override fun find(id: Long): UserProfile =
        cache.getOrPut(id) { origin.find(id) }
}

// UseCase
class GetUserProfile(private val repo: UserProfileRepository) {
    operator fun invoke(id: Long): UserProfile = repo.find(id)
}

fun main() {
    val api = ApiUserProfileRepository()
    val cachedRepo = CachingUserProfileRepository(api)
    val getUser = GetUserProfile(cachedRepo)

    val t1 = measureTimeMillis { println("1차: " + getUser(1)) }
    val t2 = measureTimeMillis { println("2차(캐시) " + getUser(1)) }

    println("첫 호출: ${t1}ms, 두 번째: ${t2}ms")         // 두 번째가 확 줄어듦
}