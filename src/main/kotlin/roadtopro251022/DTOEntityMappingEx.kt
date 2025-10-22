package roadtopro251022

data class MemberDTO(val id: Long?, val name: String?, val email: String?)
data class Member(val id: Long, val name: String, val email: String)

// DTO ↔ Entity 매핑 + 널/공백 처리
fun main() {
    val dto = MemberDTO(null, " Jonathan ", "  jon@example.com  ")
    val entity = Member(
        id = dto.id ?: 0L,
        name = dto.name?.trim().takeUnless { it.isNullOrBlank() } ?: "UNKNOWN",
        email = dto.email?.trim()?.lowercase() ?: "unknown@example.com"
    )
    println(entity)
}