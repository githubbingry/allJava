package coba;

public class enumOS {
    public static void main(String[] args) {
        OperatingSystem OS = OperatingSystem.OSX;
        System.out.println(OS);

        OS = OperatingSystem.udin;
        System.out.println(OS);

        for (OperatingSystem myVar : OperatingSystem.values()) {
            System.out.println(myVar);
        }
    }

    public enum OperatingSystem {
        OSX, WINDOWS, LINUX, udin;
        public String toString() {
            switch(this) {
                case OSX: return "Mac OS";
                case WINDOWS: return "Windows";
                case LINUX: return "Linux";
                default : return "Invalid";
            }
        }
    }
}
