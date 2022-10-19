package me.xtrm.atlas.annotations.facade

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CONSTRUCTOR
import kotlin.annotation.AnnotationTarget.FUNCTION

/**
 * Used to annotate constructors.
 *
 * @author xtrm
 * @since 0.0.1
 */
@Retention(RUNTIME)
@Target(FUNCTION, CONSTRUCTOR)
annotation class Constructor
