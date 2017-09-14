/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.android;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ParcelQuickFixTestGenerated extends AbstractParcelQuickFixTest {
    public void testAllFilesPresentInQuickfix() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/addPrimaryConstructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AddPrimaryConstructor extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInAddPrimaryConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/addPrimaryConstructor"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("constructorWithDelegate.before.Main.kt")
        public void testConstructorWithDelegate() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/addPrimaryConstructor/constructorWithDelegate.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("noQuickFix.before.Main.kt")
        public void testNoQuickFix() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/addPrimaryConstructor/noQuickFix.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/addPrimaryConstructor/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/cantBeInnerClass")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CantBeInnerClass extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInCantBeInnerClass() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/cantBeInnerClass"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/cantBeInnerClass/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/classShouldBeAnnotated")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassShouldBeAnnotated extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInClassShouldBeAnnotated() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/classShouldBeAnnotated"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/classShouldBeAnnotated/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/deleteIncompatible")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DeleteIncompatible extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInDeleteIncompatible() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/deleteIncompatible"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("creatorField.before.Main.kt")
        public void testCreatorField() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/deleteIncompatible/creatorField.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("writeToParcel.before.Main.kt")
        public void testWriteToParcel() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/deleteIncompatible/writeToParcel.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Migrations extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInMigrations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("basic.before.Main.kt")
        public void testBasic() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/basic.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("complexCase1.before.Main.kt")
        public void testComplexCase1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/complexCase1.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("customDescribeContents.before.Main.kt")
        public void testCustomDescribeContents() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/customDescribeContents.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("fromCreatorObject.before.Main.kt")
        public void testFromCreatorObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/fromCreatorObject.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("innerClassFactory.before.Main.kt")
        public void testInnerClassFactory() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/innerClassFactory.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("jvmField.before.Main.kt")
        public void testJvmField() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/jvmField.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("noWriteToParcel.before.Main.kt")
        public void testNoWriteToParcel() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/noWriteToParcel.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("withoutDescribeContents.before.Main.kt")
        public void testWithoutDescribeContents() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/migrations/withoutDescribeContents.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/noParcelableSupertype")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NoParcelableSupertype extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInNoParcelableSupertype() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/noParcelableSupertype"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("alreadyHasSupertype.before.Main.kt")
        public void testAlreadyHasSupertype() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/noParcelableSupertype/alreadyHasSupertype.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/noParcelableSupertype/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/propertyWontBeSerialized")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PropertyWontBeSerialized extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInPropertyWontBeSerialized() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/propertyWontBeSerialized"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/propertyWontBeSerialized/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/removeDuplicatingTypeParcelerAnnotation")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RemoveDuplicatingTypeParcelerAnnotation extends AbstractParcelQuickFixTest {
        public void testAllFilesPresentInRemoveDuplicatingTypeParcelerAnnotation() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/removeDuplicatingTypeParcelerAnnotation"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/quickfix/removeDuplicatingTypeParcelerAnnotation/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }
}
