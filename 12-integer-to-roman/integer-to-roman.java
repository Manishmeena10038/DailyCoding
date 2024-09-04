class Solution {
    public String intToRoman(int num) {
    //   String one[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    //   String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    //   String hun[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    //   String th[] = {"","M","MM","MMM"};

    //   return th[num/1000]+hun[(num%1000)/100]+ten[(num%100)/10]+one[(num%10)];

    int value[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String roman[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    StringBuilder sb = new StringBuilder();

    for(int i=value.length-1;i>=0;i--){
        while(num>=value[i]){
            sb.append(roman[i]);
            num-=value[i];
        }
    }
    return sb.toString();
    }
}