package Companies.Tencent;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuffer[] sbs = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuffer();
        }

        int i = 0;
        while (i < s.length()) {
            for (int ix = 0; ix < numRows && i < s.length(); ix++) {
                sbs[ix].append(c[i++]);
            }
            for (int ix = numRows-2; ix >=1 && i < s.length(); ix--) {
                sbs[ix].append(c[i++]);
            }
        }
        for (int row = 1; row < numRows; row++) {
            sbs[0].append(sbs[row]);
        }
        return sbs[0].toString();
    }
}
