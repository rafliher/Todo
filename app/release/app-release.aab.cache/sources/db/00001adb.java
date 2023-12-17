package com.androngel.todolist;

import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileHelper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"FILE_NAME", "", "readData", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "context", "Landroid/content/Context;", "writeData", "", "items", "app_release"}, k = R.styleable.FontFamily, mv = {R.xml.data_extraction_rules, 7, R.xml.data_extraction_rules}, xi = R.id.icon_group)
/* loaded from: base/dex/classes.dex */
public final class FileHelperKt {
    public static final String FILE_NAME = "todolist.dat";

    public static final void writeData(SnapshotStateList<String> items, Context context) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(context, "context");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(FILE_NAME, R.xml.backup_rules));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(items);
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.close();
    }

    public static final SnapshotStateList<String> readData(Context context) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object readObject = new ObjectInputStream(context.openFileInput(FILE_NAME)).readObject();
            Intrinsics.checkNotNull(readObject, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            arrayList = (ArrayList) readObject;
        } catch (FileNotFoundException unused) {
            arrayList = new ArrayList();
        }
        SnapshotStateList<String> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(arrayList);
        return snapshotStateList;
    }
}