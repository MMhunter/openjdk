/*
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 *
 */

/*
 * @test
 * @summary Exercise initial transformation (class file loader hook)
 *  with CDS/AppCDS with SubClass and SuperClass
 * @library /test/lib /test/hotspot/jtreg/runtime/appcds /test/hotspot/jtreg/runtime/appcds/test-classes
 *     /test/hotspot/jtreg/runtime/appcds/jvmti /test/hotspot/jtreg/runtime/SharedArchiveFile/serviceability
 *     /test/hotspot/jtreg/runtime/SharedArchiveFile/serviceability/transformRelatedClasses
 *     /test/hotspot/jtreg/runtime/SharedArchiveFile /test/hotspot/jtreg/testlibrary/jvmti
 *     /test/hotspot/jtreg/runtime/appcds/customLoader
 *     /test/hotspot/jtreg/runtime/appcds/customLoader/test-classes
 * @requires (vm.opt.UseCompressedOops == null) | (vm.opt.UseCompressedOops == true)
 * @requires vm.flavor != "minimal"
 * @modules java.base/jdk.internal.misc
 *          jdk.jartool/sun.tools.jar
 *          java.management
 *          java.instrument
 * @build TransformUtil TransformerAgent SubClass SuperClazz
 * @run main/othervm TransformRelatedClassesAppCDS SuperClazz SubClass
 */
