class Solution {
    public String validIPAddress(String IP) {
        if (IP == null || IP.length() == 0)
            return "Neither";
        if (IP.contains("."))
            return validateIPv4(IP);
        if (IP.contains(":"))
            return validateIPv6(IP);
        return "Neither";
    }
    private String validateIPv4(String ip) {

        String[] parts = ip.split("\\.", -1);

        if (parts.length != 4)
            return "Neither";

        for (String part : parts) {

            if (part.length() == 0)
                return "Neither";

            if (part.length() > 3)
                return "Neither";
            if (part.length() > 1 && part.charAt(0) == '0')
                return "Neither";

            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch))
                    return "Neither";
            }
            int num = Integer.parseInt(part);

            if (num > 255)
                return "Neither";
        }

        return "IPv4";
    }
    private String validateIPv6(String ip) {

        String[] parts = ip.split(":", -1);

        if (parts.length != 8)
            return "Neither";

        String hex = "0123456789abcdefABCDEF";

        for (String part : parts) {

            if (part.length() == 0 || part.length() > 4)
                return "Neither";
            for (char ch : part.toCharArray()) {
                if (hex.indexOf(ch) == -1)
                    return "Neither";
            }
        }
        return "IPv6";
    }
}