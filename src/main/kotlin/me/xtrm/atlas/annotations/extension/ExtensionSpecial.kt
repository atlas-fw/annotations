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

package me.xtrm.atlas.annotations.extension

/**
 * @see Extends
 * @see ExtensionMember
 *
 * @author xtrm
 * @since 0.0.1
 */
annotation class ExtensionSpecial(
    val target: ExtensionSpecialPoint
)

enum class ExtensionSpecialPoint {
    CONSTRUCTOR, SUPER_CONSTRUCTOR;
}