public class JavaInstallationChecker {
    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on your computer.");
        } else {
            System.out.println("Java is not installed on your computer.");
        }
    }

    private static boolean isJavaInstalled() {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            int exitCode = process.waitFor();
            return exitCode == 0;
        } catch (Exception e) {
            return false;
        }
    }
}