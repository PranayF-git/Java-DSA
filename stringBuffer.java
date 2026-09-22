class stringBuffer{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Pranay ");
        StringBuffer guest = new StringBuffer("Manan");
        System.out.print(sb.append("Fanidhare"));
        System.out.println(sb.capacity()); //To get the string capacity(StringBuffer's)
        System.out.println(sb.charAt(2));
        System.out.println(sb.codePointAt(0));
        System.out.println(sb.codePointBefore(1));
        System.out.println("String compare " + sb.compareTo(guest));
        System.out.println(sb.hashCode());
        System.out.println(sb.substring(1, 3));
        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb.reverse());
        System.out.println(sb.insert(0, "i am"));
    }
}