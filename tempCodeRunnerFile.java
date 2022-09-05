public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        int repCount = in.nextInt();
        System.out.println(s.repeat(repCount));
        in.close();
    }