package week06.qaTime;

public class Day16_3 {
    public static void main(String[] args) {
        /*

        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az    A
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz    B
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez


         */


        for(char C = 'A' ; C < 'F' ; C++){                                // takes care of the row
           // System.out.println(c);  // when the row is A  , B
            for (char c = 'a' ; c <= 'z' ; c++){      // a, b -----z      // takes care of column
                String result = ""+C+c;
                System.out.print(result+" "); // Aa - Ab -   Az
            }
            System.out.println(); // to go to next row
        }


    }
}
