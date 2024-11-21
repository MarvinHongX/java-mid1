package lang.object.equals;

import java.util.Objects;

public class UserV1 {
    private String id;

    public UserV1(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserV1 userV1 = (UserV1) obj;
        return Objects.equals(id, userV1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}