package com.androngel.todolist;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import kotlin.Metadata;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/androngel/todolist/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = R.xml.data_extraction_rules, mv = {R.xml.data_extraction_rules, 7, R.xml.data_extraction_rules}, xi = R.id.icon_group)
/* loaded from: base/dex/classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableSingletons$MainActivityKt.INSTANCE.m4946getLambda3$app_release(), R.xml.data_extraction_rules, null);
    }
}