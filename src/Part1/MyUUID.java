package Part1;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public final class MyUUID implements Comparable<MyUUID>{


    private final String key;
    private final UUID uuid;

    public static UUID Encoder(@NotNull final String key) {
        return UUID.nameUUIDFromBytes(key.getBytes()); // the function convert bytes array to uuid
    }

    public static String Decoder(@NotNull final MyUUID mUUID) {
        return mUUID.getStringUUID();
    }

    public String getStringUUID() {
        return key;
    }

    @Override
    public int compareTo(@NotNull MyUUID o) {
        return this.uuid.compareTo(o.uuid);
    }

    public MyUUID(String key) {
        this.key = key;
        this.uuid = MyUUID.Encoder(key);
    }

    @Override
    public String toString() {
        return this.key;
    }

}
