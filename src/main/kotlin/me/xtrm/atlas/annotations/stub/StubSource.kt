package me.xtrm.atlas.annotations.stub

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

/**
 * Indicates that this stub class has been generated with data
 * from the provided mapping classes.
 *
 * For example, taking the following (kotlin) mapping class:
 * ```kotlin
 * package mappings
 *
 * @Map("my/mapped/TargetType")
 * interface TargetMapping {
 *     @Map("instance")
 *     @Modifiers(FINAL, STATIC)
 *     val instance: TargetMapping
 * }
 * ```
 * will generate the following (java) stub class:
 * ```java
 * package my.mapped;
 *
 * @StubSource(TargetMapping.class)
 * public class TargetType {
 *     @StubSource(TargetMapping.class, member = "instance:Lmappings/TargetMapping;")
 *     public static final TargetType instance;
 * }
 * ```
 *
 * @see me.xtrm.atlas.annotations.facade.Facade
 * @since 0.0.1
 */
@Target(FIELD, FUNCTION, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, FIELD, TYPE, CLASS)
@Retention(RUNTIME)
annotation class StubSource(
    @get:JvmName("value") vararg val classes: KClass<*>,
    val member: String = ""
)
