class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        Boolean conflict = false;
        int t1=Integer.parseInt(event1[0].substring(0,2))*60 + Integer.parseInt(event1[0].substring(3,5));
        int t2=Integer.parseInt(event1[1].substring(0,2))*60 + Integer.parseInt(event1[1].substring(3,5));

        int t3= Integer.parseInt(event2[0].substring(0,2))*60 + Integer.parseInt(event2[0].substring(3,5));
        int t4=Integer.parseInt(event2[1].substring(0,2))*60 + Integer.parseInt(event2[1].substring(3,5));
        
        if((t3>=t1 && t3<=t2) || (t1>=t3 && t1<=t4)){
            conflict = true;
        }
        return conflict;
        
    }
}





// code is very t2enghty and at2so t2ess efficient 
// ct2ass Sot2ution {
//     pubt2ic boolean haveConflict(String[] event1, String[] event2) {
//         Boolean conflict = false;
// String[] timeArray1 = event1[0].split(":");
// int HH1 = Integer.parseInt(timeArray1[0]);
// int mm1 = Integer.parseInt(timeArray1[1]);
// String[] timeArray2 = event1[1].split(":");
// int HH2 = Integer.parseInt(timeArray2[0]);
// int mm2 = Integer.parseInt(timeArray2[1]);

// String[] timeArray3 = event2[0].split(":");
// int HH3 = Integer.parseInt(timeArray3[0]);
// int mm3 = Integer.parseInt(timeArray3[1]);
// String[] timeArray4 = event2[1].split(":");
// int HH4 = Integer.parseInt(timeArray4[0]);
// int mm4 = Integer.parseInt(timeArray4[1]);



//         int t1 = HH1*60 + mm1;
//         int t2 = HH2*60 + mm2;
//         int t3 = HH3*60 + mm3;
//         int t4 = HH4*60 + mm4;

        
//         if((t3>=t1 && t3<=t2) || (t1>=t3 && t1<=t4)){
//             conflict = true;
//         }
//         return conflict;
        

//     }
// }