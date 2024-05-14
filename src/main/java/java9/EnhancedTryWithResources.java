package java9;

import java.io.Closeable;

public class EnhancedTryWithResources {
    public static void main(String[] args) {
        // The resource variable should be final or effectively final
        // If wish to pass multiple variables separate them by ;
        final Resource resource = new Resource();

        try (resource) {
            resource.use();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Resource is closed: " + resource.isClosed);
    }

    static class Resource implements Closeable {
        private boolean isClosed;

        Resource() {
            isClosed = false;
        }

        public void use() {
            System.out.println("Resource being used");
        }

        @Override
        public void close() {
            System.out.println("Resource being closed");
            isClosed = true;
        }
    }
}
