package im.actor.core.api.updates;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class UpdateEventBusDeviceDisconnected extends Update {

    public static final int HEADER = 0xa03;
    public static UpdateEventBusDeviceDisconnected fromBytes(byte[] data) throws IOException {
        return Bser.parse(new UpdateEventBusDeviceDisconnected(), data);
    }

    private String id;
    private int userId;
    private long deviceId;

    public UpdateEventBusDeviceDisconnected(@NotNull String id, int userId, long deviceId) {
        this.id = id;
        this.userId = userId;
        this.deviceId = deviceId;
    }

    public UpdateEventBusDeviceDisconnected() {

    }

    @NotNull
    public String getId() {
        return this.id;
    }

    public int getUserId() {
        return this.userId;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.id = values.getString(1);
        this.userId = values.getInt(2);
        this.deviceId = values.getLong(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.id == null) {
            throw new IOException();
        }
        writer.writeString(1, this.id);
        writer.writeInt(2, this.userId);
        writer.writeLong(3, this.deviceId);
    }

    @Override
    public String toString() {
        String res = "update EventBusDeviceDisconnected{";
        res += "id=" + this.id;
        res += ", userId=" + this.userId;
        res += ", deviceId=" + this.deviceId;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}