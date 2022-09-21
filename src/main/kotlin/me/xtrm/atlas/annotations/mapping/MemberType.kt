package me.xtrm.atlas.annotations.mapping

/**
 * Enumeration of the different types of JVM class members.
 *
 * @author xtrm
 * @since 0.0.1
 */
enum class MemberType {
    FIELD,
    METHOD,
    CONSTRUCTOR,
    TYPE,
    ANNOTATION_TYPE,
    ENUM_CONSTANT,
    OTHER,
}
