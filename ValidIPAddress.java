package LeetCodeJune;

import java.util.HashSet;
import java.util.Set;

public class ValidIPAddress {
    public String validIPAddress(String IP) {
        Set<Character> potentialV6Char = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            potentialV6Char.add((char)('0' + i));
        }
        for (int i = 0; i < 6; i++) {
            potentialV6Char.add((char)('a' + i));
        }
        
        for (int i = 0; i < IP.length(); i++) {
            if (IP.charAt(i) == '.') {
                // potential IPv4
                String[] digits = IP.split("\\.", -1);
                if (digits.length != 4) {
                    return "Neither";
                }
                for (String str : digits) {
                    if (str.length() == 0 || str.length() > 4) {
                        return "Neither";
                    }
                    for (int j = 0; j < str.length(); j++) {
                        char ch = str.charAt(j);
                        if (!Character.isDigit(ch)) {
                            return "Neither";
                        }
                    }
                    
                    int val = Integer.parseInt(str);
                    if (val >= 256) {
                        return "Neither";
                    }
                    if (val == 0 && str.length() != 1) {
                        return "Neither";
                    }
                    if (val != 0 && val < 100 && str.charAt(0) == '0') {
                        return "Neither";
                    }
                }
                return "IPv4";
            }
            
            if (IP.charAt(i) == ':') {
                // potential IPv6
                IP = IP.toLowerCase();
                String[] digits = IP.split(":", -1);
                
                if (digits.length != 8) {
                    return "Neither";
                }
                for (String str : digits) {
                    if (str.length() == 0 || str.length() > 4) {
                        return "Neither";
                    }
                    for (int j = 0; j < str.length(); j++) {
                        if (!potentialV6Char.contains(str.charAt(j))) {
                            return "Neither";
                        }
                    }
                }
                return "IPv6";
            }
        }       
        return "Neither";
    }
}
