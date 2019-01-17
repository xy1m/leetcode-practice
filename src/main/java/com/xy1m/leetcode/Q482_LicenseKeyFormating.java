package com.xy1m.leetcode;

import java.util.Random;
import java.util.StringJoiner;

public class Q482_LicenseKeyFormating {
    public String licenseKeyFormatting(String s, int k) {
        // s non-empty
        // 0<s.length()<12,000
        // k is positive
        // s contains [a-zA-z0-9]

        // wrong combination
        // first part can be 1, others must be k.
        s = s.replaceAll("-", "").toUpperCase();
        if (k > s.length()) {
            return null;
        }
        int extra = s.length() % k;
        int numOfDashes = s.length() / k - 1;
        StringBuilder sb = new StringBuilder();
        if (extra != 0) {
            sb.append(s, 0, extra).append("-");
        }
        for (int i = 0; i <= numOfDashes; i++) {
            sb.append(s, extra + i * k, extra + (i + 1) * k).append("-");
        }
        return sb.substring(0, sb.length()-1);
    }

    public static void main(String[] args) {
        Q482_LicenseKeyFormating main = new Q482_LicenseKeyFormating();
        System.out.println(main.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(main.licenseKeyFormatting("2-5g-3-J", 2));

    }
}
