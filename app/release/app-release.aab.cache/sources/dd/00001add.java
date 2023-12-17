package com.androngel.todolist;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"MainPage", "", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = R.styleable.FontFamily, mv = {R.xml.data_extraction_rules, 7, R.xml.data_extraction_rules}, xi = R.id.icon_group)
/* loaded from: base/dex/classes.dex */
public final class MainActivityKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v42 */
    public static final void MainPage(Composer composer, final int i) {
        final MutableState mutableState;
        Composer composer2;
        String str;
        SnapshotStateList<String> snapshotStateList;
        MutableState mutableState2;
        Composer composer3;
        final MutableState mutableState3;
        String str2;
        Composer composer4;
        Composer startRestartGroup = composer.startRestartGroup(-972779443);
        ComposerKt.sourceInformation(startRestartGroup, "C(MainPage)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-972779443, i, -1, "com.androngel.todolist.MainPage (MainActivity.kt:73)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, R.styleable.FontFamily, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState4 = (MutableState) rememberedValue;
            final SnapshotStateList<String> readData = FileHelperKt.readData(context);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager = (FocusManager) consume2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, R.styleable.FontFamily, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState5 = (MutableState) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf((int) R.xml.backup_rules), null, R.styleable.FontFamily, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState6 = (MutableState) rememberedValue3;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, R.styleable.FontFamily, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState7 = (MutableState) rememberedValue4;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, R.styleable.FontFamily, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState8 = (MutableState) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, R.styleable.FontFamily, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState9 = (MutableState) rememberedValue6;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, R.xml.data_extraction_rules, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "C(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, R.xml.backup_rules);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1935constructorimpl = Updater.m1935constructorimpl(startRestartGroup);
            Updater.m1942setimpl(m1935constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m1942setimpl(m1935constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m1942setimpl(m1935constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m1942setimpl(m1935constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1925boximpl(SkippableUpdater.m1926constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((int) R.xml.backup_rules));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1163856341);
            ComposerKt.sourceInformation(startRestartGroup, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, R.xml.data_extraction_rules, null);
            float f = (float) R.styleable.GradientColorItem;
            Modifier m442padding3ABfNKs = PaddingKt.m442padding3ABfNKs(fillMaxWidth$default, Dp.m4656constructorimpl(f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, R.id.icon_group);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume8;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m442padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1935constructorimpl2 = Updater.m1935constructorimpl(startRestartGroup);
            Updater.m1942setimpl(m1935constructorimpl2, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m1942setimpl(m1935constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m1942setimpl(m1935constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m1942setimpl(m1935constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1925boximpl(SkippableUpdater.m1926constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((int) R.xml.backup_rules));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            ComposerKt.sourceInformation(startRestartGroup, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String str3 = (String) mutableState4.getValue();
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long m2327getTransparent0d7_KjU = Color.Companion.m2327getTransparent0d7_KjU();
            long m2327getTransparent0d7_KjU2 = Color.Companion.m2327getTransparent0d7_KjU();
            long m2323getGreen0d7_KjU = Color.Companion.m2323getGreen0d7_KjU();
            long m2329getWhite0d7_KjU = Color.Companion.m2329getWhite0d7_KjU();
            TextFieldColors m1319textFieldColorsl59Burw = textFieldDefaults.m1319textFieldColorsl59Burw(Color.Companion.m2329getWhite0d7_KjU(), 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 8).m996getPrimary0d7_KjU(), Color.Companion.m2329getWhite0d7_KjU(), 0L, null, m2327getTransparent0d7_KjU, m2327getTransparent0d7_KjU2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, m2323getGreen0d7_KjU, m2329getWhite0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 14158854, 905969664, 100663296, 267648818);
            RoundedCornerShape m692RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m692RoundedCornerShape0680j_4(Dp.m4656constructorimpl(f));
            float f2 = (float) R.xml.data_extraction_rules;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, BorderKt.m183borderxT4_qwU(Modifier.Companion, Dp.m4656constructorimpl(f2), Color.Companion.m2318getBlack0d7_KjU(), RoundedCornerShapeKt.m692RoundedCornerShape0680j_4(Dp.m4656constructorimpl(f))), 7.0f, false, R.styleable.FontFamily, null);
            float f3 = (float) R.id.right_icon;
            Modifier m469height3ABfNKs = SizeKt.m469height3ABfNKs(weight$default, Dp.m4656constructorimpl(f3));
            TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, TextAlign.m4556boximpl(TextAlign.Companion.m4563getCentere0LSkKk()), (TextDirection) null, 0L, (TextIndent) null, 245759, (DefaultConstructorMarker) null);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState4);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue7 == Composer.Companion.getEmpty()) {
                rememberedValue7 = (Function1) new Function1<String, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.xml.data_extraction_rules);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                        invoke2(str4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState4.setValue(it);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldKt.TextField(str3, (Function1<? super String, Unit>) rememberedValue7, m469height3ABfNKs, false, false, textStyle, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.m4947getLambda4$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, (int) R.xml.backup_rules, (MutableInteractionSource) null, (Shape) m692RoundedCornerShape0680j_4, m1319textFieldColorsl59Burw, startRestartGroup, 1572864, (int) R.xml.backup_rules, 262040);
            SpacerKt.Spacer(SizeKt.m488width3ABfNKs(Modifier.Companion, Dp.m4656constructorimpl(f)), startRestartGroup, 6);
            Modifier m469height3ABfNKs2 = SizeKt.m469height3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 3.0f, false, R.styleable.FontFamily, null), Dp.m4656constructorimpl(f3));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long colorResource = ColorResources_androidKt.colorResource(R.color.green, startRestartGroup, R.xml.backup_rules);
            long m2329getWhite0d7_KjU2 = Color.Companion.m2329getWhite0d7_KjU();
            int i2 = R.xml.backup_rules;
            ButtonColors m945buttonColorsro_MJ88 = buttonDefaults.m945buttonColorsro_MJ88(colorResource, m2329getWhite0d7_KjU2, 0L, 0L, startRestartGroup, 32816, R.string.navigation_menu);
            ButtonKt.Button(new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(R.xml.backup_rules);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (mutableState4.getValue().length() > 0 ? R.xml.data_extraction_rules : R.xml.backup_rules) {
                        readData.add(mutableState4.getValue());
                        FileHelperKt.writeData(readData, context);
                        mutableState4.setValue("");
                        FocusManager.clearFocus$default(focusManager, false, R.xml.data_extraction_rules, null);
                        return;
                    }
                    Toast.makeText(context, "Please enter a TODO", (int) R.xml.backup_rules).show();
                }
            }, m469height3ABfNKs2, false, RoundedCornerShapeKt.m692RoundedCornerShape0680j_4(Dp.m4656constructorimpl(f)), m945buttonColorsro_MJ88, null, BorderStrokeKt.m192BorderStrokecXLIe8U(Dp.m4656constructorimpl(f2), Color.Companion.m2318getBlack0d7_KjU()), null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4948getLambda5$app_release(), startRestartGroup, 806879232, 420);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Object[] objArr = new Object[6];
            objArr[i2] = readData;
            objArr[R.xml.data_extraction_rules] = mutableState8;
            objArr[R.styleable.FontFamily] = mutableState9;
            objArr[R.styleable.FontFamilyFont] = mutableState7;
            objArr[R.styleable.GradientColor] = mutableState6;
            objArr[R.styleable.GradientColorItem] = mutableState5;
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            int i3 = i2;
            for (int i4 = 6; i3 < i4; i4 = 6) {
                i2 |= startRestartGroup.changed(objArr[i3]) ? 1 : 0;
                i3 += R.xml.data_extraction_rules;
            }
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (i2 != 0 || rememberedValue8 == Composer.Companion.getEmpty()) {
                mutableState = mutableState9;
                rememberedValue8 = (Function1) new Function1<LazyListScope, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.xml.data_extraction_rules);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        int size = readData.size();
                        final SnapshotStateList<String> snapshotStateList2 = readData;
                        final MutableState<String> mutableState10 = mutableState8;
                        final MutableState<Boolean> mutableState11 = mutableState;
                        final MutableState<Boolean> mutableState12 = mutableState7;
                        final MutableState<Integer> mutableState13 = mutableState6;
                        final MutableState<Boolean> mutableState14 = mutableState5;
                        LazyListScope.items$default(LazyColumn, size, null, null, ComposableLambdaKt.composableLambdaInstance(-1528934822, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(R.styleable.GradientColor);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer5, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer5, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope items, final int i5, Composer composer5, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(items, "$this$items");
                                if ((i6 & 112) == 0) {
                                    i7 = i6 | (composer5.changed(i5) ? R.id.accessibility_custom_action_9 : R.string.range_end);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 721) != 144 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1528934822, i7, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:163)");
                                    }
                                    final String str4 = snapshotStateList2.get(i5);
                                    Modifier m446paddingqDBjuR0$default = PaddingKt.m446paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, R.xml.data_extraction_rules, null), 0.0f, 0.0f, 0.0f, Dp.m4656constructorimpl((float) R.xml.data_extraction_rules), 7, null);
                                    CardColors m957cardColorsro_MJ88 = CardDefaults.INSTANCE.m957cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer5, 8).m996getPrimary0d7_KjU(), Color.Companion.m2329getWhite0d7_KjU(), 0L, 0L, composer5, 32816, R.string.navigation_menu);
                                    RoundedCornerShape m692RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m692RoundedCornerShape0680j_4(Dp.m4656constructorimpl((float) R.xml.backup_rules));
                                    final MutableState<String> mutableState15 = mutableState10;
                                    final MutableState<Boolean> mutableState16 = mutableState11;
                                    final MutableState<Boolean> mutableState17 = mutableState12;
                                    final MutableState<Integer> mutableState18 = mutableState13;
                                    final MutableState<Boolean> mutableState19 = mutableState14;
                                    final int i8 = i7;
                                    CardKt.Card(m446paddingqDBjuR0$default, m692RoundedCornerShape0680j_42, m957cardColorsro_MJ88, null, null, ComposableLambdaKt.composableLambda(composer5, -1210349400, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt.MainPage.1.2.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(R.styleable.FontFamilyFont);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer6, Integer num) {
                                            invoke(columnScope, composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r0v28 */
                                        /* JADX WARN: Type inference failed for: r2v47 */
                                        /* JADX WARN: Type inference failed for: r3v15 */
                                        /* JADX WARN: Type inference failed for: r44v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
                                        public final void invoke(ColumnScope Card, Composer composer6, int i9) {
                                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                            if ((i9 & R.id.view_tree_saved_state_registry_owner) != R.string.range_end || !composer6.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1210349400, i9, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:176)");
                                                }
                                                Modifier m442padding3ABfNKs2 = PaddingKt.m442padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, R.xml.data_extraction_rules, null), Dp.m4656constructorimpl(10));
                                                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                final MutableState<String> mutableState20 = mutableState15;
                                                final String str5 = str4;
                                                final MutableState<Boolean> mutableState21 = mutableState16;
                                                final MutableState<Boolean> mutableState22 = mutableState17;
                                                final MutableState<Integer> mutableState23 = mutableState18;
                                                final int i10 = i5;
                                                final MutableState<Boolean> mutableState24 = mutableState19;
                                                composer6.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer6, "C(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer6, R.id.line3);
                                                composer6.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume9 = composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                Density density3 = (Density) consume9;
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume10 = composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                LayoutDirection layoutDirection3 = (LayoutDirection) consume10;
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume11 = composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume11;
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m442padding3ABfNKs2);
                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor3);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                composer6.disableReusing();
                                                Composer m1935constructorimpl3 = Updater.m1935constructorimpl(composer6);
                                                Updater.m1942setimpl(m1935constructorimpl3, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                                Updater.m1942setimpl(m1935constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                                Updater.m1942setimpl(m1935constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                                Updater.m1942setimpl(m1935constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                                composer6.enableReusing();
                                                materializerOf3.invoke(SkippableUpdater.m1925boximpl(SkippableUpdater.m1926constructorimpl(composer6)), composer6, Integer.valueOf((int) R.xml.backup_rules));
                                                composer6.startReplaceableGroup(2058660585);
                                                composer6.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer6, "C80@4021L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                long m2329getWhite0d7_KjU3 = Color.Companion.m2329getWhite0d7_KjU();
                                                long sp = TextUnitKt.getSp((int) R.string.selected);
                                                int m4598getEllipsisgIe3tQ8 = TextOverflow.Companion.m4598getEllipsisgIe3tQ8();
                                                Modifier m488width3ABfNKs = SizeKt.m488width3ABfNKs(Modifier.Companion, Dp.m4656constructorimpl((float) AnimationConstants.DefaultDurationMillis));
                                                composer6.startReplaceableGroup(1618982084);
                                                ComposerKt.sourceInformation(composer6, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                                boolean changed2 = composer6.changed(mutableState20) | composer6.changed(str5) | composer6.changed(mutableState21);
                                                Object rememberedValue9 = composer6.rememberedValue();
                                                if (changed2 || rememberedValue9 == Composer.Companion.getEmpty()) {
                                                    rememberedValue9 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$2$1$1$1$1$1$1
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(R.xml.backup_rules);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                            invoke2();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            mutableState20.setValue(str5);
                                                            mutableState21.setValue(true);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(rememberedValue9);
                                                }
                                                composer6.endReplaceableGroup();
                                                TextKt.m1339TextfLXpl1I(str5, ClickableKt.m197clickableXHw0xAI$default(m488width3ABfNKs, false, null, null, rememberedValue9, 7, null), m2329getWhite0d7_KjU3, sp, null, null, null, 0L, null, null, 0L, m4598getEllipsisgIe3tQ8, false, R.styleable.FontFamily, null, null, composer6, 3456, 3120, 55280);
                                                composer6.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer6, "C(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                                                boolean z = false;
                                                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer6, R.xml.backup_rules);
                                                composer6.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume12 = composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                Density density4 = (Density) consume12;
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume13 = composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                LayoutDirection layoutDirection4 = (LayoutDirection) consume13;
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume14 = composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume14;
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(Modifier.Companion);
                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor4);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                composer6.disableReusing();
                                                Composer m1935constructorimpl4 = Updater.m1935constructorimpl(composer6);
                                                Updater.m1942setimpl(m1935constructorimpl4, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                                Updater.m1942setimpl(m1935constructorimpl4, density4, ComposeUiNode.Companion.getSetDensity());
                                                Updater.m1942setimpl(m1935constructorimpl4, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                                                Updater.m1942setimpl(m1935constructorimpl4, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                                                composer6.enableReusing();
                                                materializerOf4.invoke(SkippableUpdater.m1925boximpl(SkippableUpdater.m1926constructorimpl(composer6)), composer6, Integer.valueOf((int) R.xml.backup_rules));
                                                composer6.startReplaceableGroup(2058660585);
                                                composer6.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer6, "C80@4021L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                                Object[] objArr2 = new Object[R.styleable.GradientColorItem];
                                                objArr2[R.xml.backup_rules] = mutableState22;
                                                objArr2[R.xml.data_extraction_rules] = mutableState23;
                                                objArr2[R.styleable.FontFamily] = Integer.valueOf(i10);
                                                objArr2[R.styleable.FontFamilyFont] = mutableState20;
                                                objArr2[R.styleable.GradientColor] = str5;
                                                composer6.startReplaceableGroup(-568225417);
                                                ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                                for (int i11 = R.xml.backup_rules; i11 < R.styleable.GradientColorItem; i11 += R.xml.data_extraction_rules) {
                                                    z |= composer6.changed(objArr2[i11]);
                                                }
                                                Object rememberedValue10 = composer6.rememberedValue();
                                                if (z || rememberedValue10 == Composer.Companion.getEmpty()) {
                                                    rememberedValue10 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$2$1$1$1$1$2$1$1
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(R.xml.backup_rules);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                            invoke2();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            mutableState22.setValue(true);
                                                            mutableState23.setValue(Integer.valueOf(i10));
                                                            mutableState20.setValue(str5);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(rememberedValue10);
                                                }
                                                composer6.endReplaceableGroup();
                                                IconButtonKt.IconButton(rememberedValue10, null, false, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4949getLambda6$app_release(), composer6, 196608, R.id.accessibility_custom_action_7);
                                                Integer valueOf = Integer.valueOf(i10);
                                                composer6.startReplaceableGroup(1618982084);
                                                ComposerKt.sourceInformation(composer6, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                                boolean changed3 = composer6.changed(valueOf) | composer6.changed(mutableState24) | composer6.changed(mutableState23);
                                                Object rememberedValue11 = composer6.rememberedValue();
                                                if (changed3 || rememberedValue11 == Composer.Companion.getEmpty()) {
                                                    rememberedValue11 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$2$1$1$1$1$2$2$1
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(R.xml.backup_rules);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                            invoke2();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            mutableState24.setValue(true);
                                                            mutableState23.setValue(Integer.valueOf(i10));
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(rememberedValue11);
                                                }
                                                composer6.endReplaceableGroup();
                                                IconButtonKt.IconButton(rememberedValue11, null, false, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4950getLambda7$app_release(), composer6, 196608, R.id.accessibility_custom_action_7);
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }), composer5, 196614, R.id.accessibility_custom_action_3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }), 6, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            } else {
                mutableState = mutableState9;
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState10 = mutableState;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, rememberedValue8, startRestartGroup, R.xml.backup_rules, 255);
            startRestartGroup.startReplaceableGroup(-1838164058);
            if (((Boolean) mutableState5.getValue()).booleanValue()) {
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(mutableState5);
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue9 == Composer.Companion.getEmpty()) {
                    rememberedValue9 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$3$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(R.xml.backup_rules);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState5.setValue(false);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceableGroup();
                mutableState2 = mutableState6;
                composer2 = startRestartGroup;
                str = "C(remember)P(1):Composables.kt#9igjgp";
                snapshotStateList = readData;
                AndroidAlertDialog_androidKt.m925AlertDialogOix01E0(rememberedValue9, ComposableLambdaKt.composableLambda(startRestartGroup, 887032548, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i5) {
                        if ((i5 & R.string.indeterminate) != R.styleable.FontFamily || !composer5.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(887032548, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:244)");
                            }
                            final SnapshotStateList<String> snapshotStateList2 = readData;
                            final MutableState<Integer> mutableState11 = mutableState6;
                            final Context context2 = context;
                            final MutableState<Boolean> mutableState12 = mutableState5;
                            ButtonKt.TextButton(new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$4.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(R.xml.backup_rules);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snapshotStateList2.remove(mutableState11.getValue().intValue());
                                    FileHelperKt.writeData(snapshotStateList2, context2);
                                    mutableState12.setValue(false);
                                    Toast.makeText(context2, "Item is removed from the list.", (int) R.xml.backup_rules).show();
                                }
                            }, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4951getLambda8$app_release(), composer5, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1476809114, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$5
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.runtime.Composer] */
                    /* JADX WARN: Type inference failed for: r2v4 */
                    public final void invoke(Composer composer5, int i5) {
                        if ((i5 & R.string.indeterminate) == R.styleable.FontFamily && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1476809114, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:256)");
                        }
                        final MutableState<Boolean> mutableState11 = mutableState5;
                        composer5.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                        boolean changed3 = composer5.changed(mutableState11);
                        Object rememberedValue10 = composer5.rememberedValue();
                        if (changed3 || rememberedValue10 == Composer.Companion.getEmpty()) {
                            rememberedValue10 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$5$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(R.xml.backup_rules);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    mutableState11.setValue(false);
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue10);
                        }
                        composer5.endReplaceableGroup();
                        ButtonKt.TextButton(rememberedValue10, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4952getLambda9$app_release(), composer5, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), null, ComposableSingletons$MainActivityKt.INSTANCE.m4938getLambda10$app_release(), ComposableSingletons$MainActivityKt.INSTANCE.m4939getLambda11$app_release(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772592, R.xml.backup_rules, 16276);
            } else {
                composer2 = startRestartGroup;
                str = "C(remember)P(1):Composables.kt#9igjgp";
                snapshotStateList = readData;
                mutableState2 = mutableState6;
            }
            composer2.endReplaceableGroup();
            Composer composer5 = composer2;
            composer5.startReplaceableGroup(-1838162945);
            if (((Boolean) mutableState7.getValue()).booleanValue()) {
                composer5.startReplaceableGroup(1157296644);
                String str4 = str;
                ComposerKt.sourceInformation(composer5, str4);
                boolean changed3 = composer5.changed(mutableState7);
                Object rememberedValue10 = composer5.rememberedValue();
                if (changed3 || rememberedValue10 == Composer.Companion.getEmpty()) {
                    rememberedValue10 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$6$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(R.xml.backup_rules);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState7.setValue(false);
                        }
                    };
                    composer5.updateRememberedValue(rememberedValue10);
                }
                composer5.endReplaceableGroup();
                final SnapshotStateList<String> snapshotStateList2 = snapshotStateList;
                final MutableState mutableState11 = mutableState2;
                mutableState3 = mutableState8;
                str2 = str4;
                composer3 = composer5;
                AndroidAlertDialog_androidKt.m925AlertDialogOix01E0(rememberedValue10, ComposableLambdaKt.composableLambda(composer5, 1890224717, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$7
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer6, int i5) {
                        if ((i5 & R.string.indeterminate) != R.styleable.FontFamily || !composer6.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1890224717, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:278)");
                            }
                            final SnapshotStateList<String> snapshotStateList3 = snapshotStateList2;
                            final MutableState<Integer> mutableState12 = mutableState11;
                            final MutableState<String> mutableState13 = mutableState8;
                            final Context context2 = context;
                            final MutableState<Boolean> mutableState14 = mutableState7;
                            ButtonKt.TextButton(new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$7.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(R.xml.backup_rules);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snapshotStateList3.set(mutableState12.getValue().intValue(), mutableState13.getValue());
                                    FileHelperKt.writeData(snapshotStateList3, context2);
                                    mutableState14.setValue(false);
                                    Toast.makeText(context2, "Item is updated.", (int) R.xml.backup_rules).show();
                                }
                            }, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4940getLambda12$app_release(), composer6, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer6.skipToGroupEnd();
                    }
                }), null, ComposableLambdaKt.composableLambda(composer5, -2018880177, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$8
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.runtime.Composer] */
                    /* JADX WARN: Type inference failed for: r2v4 */
                    public final void invoke(Composer composer6, int i5) {
                        if ((i5 & R.string.indeterminate) == R.styleable.FontFamily && composer6.getSkipping()) {
                            composer6.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2018880177, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:290)");
                        }
                        final MutableState<Boolean> mutableState12 = mutableState7;
                        composer6.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                        boolean changed4 = composer6.changed(mutableState12);
                        Object rememberedValue11 = composer6.rememberedValue();
                        if (changed4 || rememberedValue11 == Composer.Companion.getEmpty()) {
                            rememberedValue11 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$8$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(R.xml.backup_rules);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    mutableState12.setValue(false);
                                }
                            };
                            composer6.updateRememberedValue(rememberedValue11);
                        }
                        composer6.endReplaceableGroup();
                        ButtonKt.TextButton(rememberedValue11, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4941getLambda13$app_release(), composer6, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), null, ComposableSingletons$MainActivityKt.INSTANCE.m4942getLambda14$app_release(), ComposableLambdaKt.composableLambda(composer5, -1440086574, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$9
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.runtime.Composer] */
                    /* JADX WARN: Type inference failed for: r4v4 */
                    public final void invoke(Composer composer6, int i5) {
                        if ((i5 & R.string.indeterminate) != R.styleable.FontFamily || !composer6.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1440086574, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:272)");
                            }
                            String value = mutableState8.getValue();
                            final MutableState<String> mutableState12 = mutableState8;
                            composer6.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                            boolean changed4 = composer6.changed(mutableState12);
                            Object rememberedValue11 = composer6.rememberedValue();
                            if (changed4 || rememberedValue11 == Composer.Companion.getEmpty()) {
                                rememberedValue11 = (Function1) new Function1<String, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$9$1$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(R.xml.data_extraction_rules);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                        invoke2(str5);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState12.setValue(it);
                                    }
                                };
                                composer6.updateRememberedValue(rememberedValue11);
                            }
                            composer6.endReplaceableGroup();
                            TextFieldKt.TextField(value, (Function1<? super String, Unit>) rememberedValue11, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, (int) R.xml.backup_rules, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, (Composer) composer6, (int) R.xml.backup_rules, (int) R.xml.backup_rules, 1048572);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer6.skipToGroupEnd();
                    }
                }), null, 0L, 0L, 0L, 0L, 0.0f, null, composer3, 1772592, R.xml.backup_rules, 16276);
            } else {
                composer3 = composer5;
                mutableState3 = mutableState8;
                str2 = str;
            }
            composer3.endReplaceableGroup();
            if (((Boolean) mutableState10.getValue()).booleanValue()) {
                Composer composer6 = composer3;
                composer6.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer6, str2);
                boolean changed4 = composer6.changed(mutableState10);
                Object rememberedValue11 = composer6.rememberedValue();
                if (changed4 || rememberedValue11 == Composer.Companion.getEmpty()) {
                    rememberedValue11 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$10$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(R.xml.backup_rules);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState10.setValue(false);
                        }
                    };
                    composer6.updateRememberedValue(rememberedValue11);
                }
                composer6.endReplaceableGroup();
                Function2<Composer, Integer, Unit> m4944getLambda16$app_release = ComposableSingletons$MainActivityKt.INSTANCE.m4944getLambda16$app_release();
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer6, 161079473, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$12
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer7, int i5) {
                        if ((i5 & R.string.indeterminate) == R.styleable.FontFamily && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(161079473, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:306)");
                        }
                        TextKt.m1339TextfLXpl1I(mutableState3.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, R.xml.backup_rules, false, R.xml.backup_rules, null, null, composer7, R.xml.backup_rules, R.xml.backup_rules, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                composer4 = composer6;
                AndroidAlertDialog_androidKt.m925AlertDialogOix01E0(rememberedValue11, ComposableLambdaKt.composableLambda(composer6, -803576532, true, new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$11
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(R.styleable.FontFamily);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.runtime.Composer] */
                    /* JADX WARN: Type inference failed for: r2v4 */
                    public final void invoke(Composer composer7, int i5) {
                        if ((i5 & R.string.indeterminate) != R.styleable.FontFamily || !composer7.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-803576532, i5, -1, "com.androngel.todolist.MainPage.<anonymous>.<anonymous> (MainActivity.kt:309)");
                            }
                            final MutableState<Boolean> mutableState12 = mutableState10;
                            composer7.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer7, "C(remember)P(1):Composables.kt#9igjgp");
                            boolean changed5 = composer7.changed(mutableState12);
                            Object rememberedValue12 = composer7.rememberedValue();
                            if (changed5 || rememberedValue12 == Composer.Companion.getEmpty()) {
                                rememberedValue12 = (Function0) new Function0<Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$1$11$1$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(R.xml.backup_rules);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        mutableState12.setValue(false);
                                    }
                                };
                                composer7.updateRememberedValue(rememberedValue12);
                            }
                            composer7.endReplaceableGroup();
                            ButtonKt.TextButton(rememberedValue12, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m4943getLambda15$app_release(), composer7, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer7.skipToGroupEnd();
                    }
                }), null, null, null, m4944getLambda16$app_release, composableLambda, null, 0L, 0L, 0L, 0L, 0.0f, null, composer4, 1769520, R.xml.backup_rules, 16284);
            } else {
                composer4 = composer3;
            }
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            composer4.endNode();
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer4 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.androngel.todolist.MainActivityKt$MainPage$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(R.styleable.FontFamily);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                invoke(composer7, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer7, int i5) {
                MainActivityKt.MainPage(composer7, i | R.xml.data_extraction_rules);
            }
        });
    }
}