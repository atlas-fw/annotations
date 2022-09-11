/*
 * This file is part of annotations.
 *
 * annotations is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * annotations is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with annotations.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.xtrm.atlas.annotations.mapping

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*

/**
 * Used to annotate a mapped name.
 *
 * @param value The possible names for this member.
 * @param asRegex Whether the values be treated as a regular expression.
 * @param memberType Which member type this mapping corresponds to.
 *                   By default, AFW will try to deduct the member
 *                   type from the class context.
 *
 * @author xtrm
 * @since 0.0.1
 */
@Retention(RUNTIME)
@Target(CLASS, FUNCTION, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, FIELD, TYPE)
annotation class Map(
    vararg val value: String,
    val asRegex: Boolean = false,
    val memberType: MemberType = MemberType.OTHER,
)
