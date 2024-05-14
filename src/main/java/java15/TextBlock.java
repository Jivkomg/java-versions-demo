package java15;

public class TextBlock {
    public static void main(String[] args) {
        String htmlBefore = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, World</p>\n" +
                "    </body>\n" +
                "</html>\n";

        String html = """
            <html>
                <body>
                    <p>Hello, World</p>
                </body>
            </html>
            """;

        System.out.println(html);
    }

}
