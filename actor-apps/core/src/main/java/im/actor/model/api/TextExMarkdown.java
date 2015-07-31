package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import im.actor.model.droidkit.bser.util.SparseArray;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class TextExMarkdown extends TextMessageEx {

    private String markdown;

    public TextExMarkdown(@NotNull String markdown) {
        this.markdown = markdown;
    }

    public TextExMarkdown() {

    }

    public int getHeader() {
        return 1;
    }

    @NotNull
    public String getMarkdown() {
        return this.markdown;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.markdown = values.getString(2);
        if (values.hasRemaining()) {
            setUnmappedObjects(values.buildRemaining());
        }
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.markdown == null) {
            throw new IOException();
        }
        writer.writeString(2, this.markdown);
        if (this.getUnmappedObjects() != null) {
            SparseArray<Object> unmapped = this.getUnmappedObjects();
            for (int i = 0; i < unmapped.size(); i++) {
                int key = unmapped.keyAt(i);
                writer.writeUnmapped(key, unmapped.get(key));
            }
        }
    }

    @Override
    public String toString() {
        String res = "struct TextExMarkdown{";
        res += "markdown=" + this.markdown;
        res += "}";
        return res;
    }

}
