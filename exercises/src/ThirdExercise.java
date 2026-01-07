static void main() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Write a word: ");
        String text = scanner.nextLine();
        if (text.equals(":q")) break;
        String SepText = "";
        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 1) {
                SepText = SepText + text.charAt(i);
            } else {
                SepText = SepText + text.charAt(i) + ",";
            }

        }
        System.out.println(SepText);
    }
}
