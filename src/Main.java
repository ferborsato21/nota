import java.util.Scanner;
public class Main{


    public static void main(String []args) {
        double[] mat = new double[4];
        double[]port = new double[4];
        double[] his = new double[4];
        double[] geo = new double[4];
        double[]  in = new double[4];
        double[] a1 = new double[4];
        double[] media = new double[5];
        int ve,t,t1;

        ve = 0;
        t = 0;
        String c,d,sistem = "";
        String administrador,login,senha;
        c = "vc passou ";
        d = "vc não passou";
        Scanner sc = new Scanner(System.in);
        System.out.println("vc é adm?");
        administrador = sc.nextLine().toUpperCase();
        if (administrador.equals("SIM")){
            System.out.println("digite o login");
            login = sc.nextLine();
            System.out.println("digite a senha ");
            senha = sc.nextLine();
            if (login.equals("Nando")&& (senha.equals("Nando07"))) {
                System.out.println("bem vindo ");
            } else { System.out.println("credencias invalidas ");
            }}else if (administrador.equals("NÃO")) {
            System.out.println("vamos criar um login, digite o login");
            login = sc.nextLine();
            System.out.println("digite a senha ");
            senha = sc.nextLine();
        }else {System.out.println("por favor reescreva");}

        System.out.println("sua escola tem a grade por trimestre ou bimestre?");
        sistem = sc.nextLine();
        if ( sistem.equals( "bimestre")){
            System.out.println("vc esta em qual bimestre:");
            t = sc.nextInt();
            if ((t>4) || (t <1)){
                System.out.println("acho que esse bimestre não existe, mas ok");
                System.exit(0);
            }
        } else if (sistem.equals ("semestre")) {
            System.out.println("nao estava na pergunta mais ok");
            System.out.println ("vc esta em qual semestre");
            t = sc.nextInt();
            if ((t <0) || (t >2)){
                System.out.println("esse semestre não existe !!!!");
                System.exit(0);
            }
        }
        else if (sistem.equals ("trimestre")){
            System.out.println("vc esta em qual trimestre");
            t = sc.nextInt();
            if ((t>3) || (t<1)  ){
                System.out.println("acho que esse trimestre não existe, mas ok  ");
                System.exit(0);
            }
        }else {
            System.out.println("desculpe mais só atendemos trimestre e bimestre");
        }
        t1 = 1;
        while ( t != 0){
            System.out.println("digite sua nota do" + " "  + t1 + "°");
            System.out.println("digite sua nota em matematica ");
            mat[ve] = sc.nextInt();
            if ((mat[ve] <= 10) && (mat[ve] >= 9 )) {
                System.out.println("Sua nota e´A ");
            } else if ((mat[ve] >= 7) &&(mat[ve]<9)) {
                System.out.println("sua nota é B");
            } else if ((mat[ve] < 7) && (mat[ve] >= 5 ) ){
                System.out.println("sua nota é c ");
            } else if ((mat[ve] < 5) && (mat[ve] >= 0)) {
                System.out.println("sua nota é D");
            }else{
                System.out.println("sua nota é invalida");
                System.out.println("graças a essa nota o programa vai parar");
                System.exit(0);
            }
            if (mat[ve] >= 6  ){
                System.out.println( c + " matematica !!!");
            } else{
                System.out.println(d + " matematica !!");
            }

            System.out.println("digite sua nota em portugues  ");
            port[ve] = sc.nextInt();
            if ((port[ve] <= 10) && (port[ve] >= 9 )) {
                System.out.println("Sua nota e´A ");
            } else if ((port[ve] >= 7) &&(port[ve]<9)) {
                System.out.println("sua nota é B");
            } else if ((port[ve] < 7) && (port[ve] >= 5 ) ){
                System.out.println("sua nota é c ");
            } else if ((port[ve] < 5) && (port[ve] >= 0)) {
                System.out.println("sua nota é D");
            }else{
                System.out.println("sua nota é invalida");
                System.out.println("graças a essa nota o programa vai parar");
                System.exit(0);
            }
            if (port[ve] >= 6  ){
                System.out.println(c+ "em portugues !!!");
            } else{
                System.out.println(d +"em portugues !!");
            }

            System.out.println("digite sua nota em historia");
            his[ve] = sc.nextInt();
            if ((his[ve] <= 10) && (his[ve] >= 9 )) {
                System.out.println("Sua nota e´A ");
            } else if ((his[ve] >= 7) &&(his[ve]<9)) {
                System.out.println("sua nota é B");
            } else if ((his[ve] < 7) && (his[ve] >= 5 ) ){
                System.out.println("sua nota é c ");
            } else if ((his[ve] < 5) && (his[ve] >= 0)) {
                System.out.println("sua nota é D");
            }else{
                System.out.println("sua nota é invalida");
                System.out.println("graças a essa nota o programa vai parar");
                System.exit(0);
            }
            if (his[ve]>= 6  ){
                System.out.println("Você passou em historia !!!");
            } else{
                System.out.println("você não passou em historia !!");
            }
            System.out.println("digite sua nota em geografia");
            geo[ve] = sc.nextInt();
            if ((geo[ve] <= 10) && (geo[ve] >= 9 )) {
                System.out.println("Sua nota e´A ");
            } else if ((geo[ve] >= 7) &&(geo[ve]<9)) {
                System.out.println("sua nota é B");
            } else if ((geo[ve] < 7) && (geo[ve] >= 5 ) ){
                System.out.println("sua nota é c ");
            } else if ((geo[ve] < 5) && (geo[ve] >= 0)) {
                System.out.println("sua nota é D");
            }else{
                System.out.println("sua nota é invalida");
                System.out.println("graças a essa nota o programa vai parar");
                System.exit(0);

            }
            if (geo[ve]>= 6  ){
                System.out.println(c + "geografia");
            } else{
                System.out.println(d+ "não passou em geografia !!");
            }
            System.out.println("digite sua nota em ingles");
            in[ve] = sc.nextInt();
            if ((in[ve] <= 10) && (in[ve] >= 9 )) {
                System.out.println("Sua nota e´A ");
            } else if ((in[ve] >= 7) &&(in[ve]<9)) {
                System.out.println("sua nota é B");
            } else if ((in[ve] < 7) && (in[ve] >= 5 ) ){
                System.out.println("sua nota é c ");
            } else if ((in[ve] < 5) && (in[ve] >= 0)) {
                System.out.println("sua nota é D");
            }else{
                System.out.println("sua nota é invalida");
                System.out.println("graças a essa nota o programa vai parar");
                System.exit(0);
            }
            if (in[ve]>= 6  ){
                System.out.println("Você passou em ingles !!!");
            } else{
                System.out.println("você não passou em ingles !!");
            }
            a1[ve] = (mat[ve]+port[ve]+his[ve]+geo[ve]+in[ve]);
            System.out.println(a1[ve]/5 +" " +  "essa é sua media de todas as materias do " +t1);
            if (a1[ve] >= 7){
                System.out.println("vc ganhou honra ao merito do "+ t1 );
                System.out.println( sistem  +  " " );
                t = t-1 ;
                t1 = t1+1;
                ve = ve +1;
            }
        } switch (ve){
            case 1:
                media [0] = mat[0];
                System.out.println(media[0]+ "essa é a media de matematica nesse  "+ sistem );
                media [1] = port[0];
                System.out.println(media[1]+ "essa é a media de portugues  nesse  "+ sistem );
                media[2] = his[0];
                System.out.println(media[2]+ "essa é a media de historia  nesse "+ sistem );
                media[3] = geo[0];
                System.out.println(media[3]+ "essa é a media de geografia  nesse "+ sistem );
                media[4]= in[0];
                System.out.println(media[4]+ "essa é a media de ingles  nesse "+ sistem );
                break;
            case 2:
                media[0] = (mat[0] + mat[1]) /2;
                System.out.println(media[0] + "essa é a sua media de matematica nesses 2 "+ sistem );
                media[1] = (port[0] + port[1]) /2;
                System.out.println(media[1] + "essa é a sua media de portugues  nesses 2 "+ sistem );
                media[2] = (his[0]+his[1])/2;
                System.out.println(media[2]+ "essa é a media de historia  nesses 2 "+ sistem );
                media[3]= (geo[0] +geo[1]) /2;
                System.out.println(media[3]+ "essa é a media de geografia  nesses 2 "+ sistem );
                media[4] = (in[0]+ in[1])/2;
                System.out.println(media[3]+ "essa é a media de ingles  nesses 3 "+ sistem );
                System.out.println(media[4]+ "essa é a media de ingles  nesses 2 "+ sistem );



                break;
            case 3:
                media[0] = (mat[0] + mat[1] + mat[2]) /3;
                System.out.println(media[0] + "essa é sua media de matematica  nesses 3 " + sistem );

                media[1] = (port[0] + port[1] + port[2] ) /3;
                System.out.println(media[1] + "essa é a sua media de portugues  nesses 3 "+ sistem );
                media[2] =  (his[0]+his[1] +his[2])/3;
                System.out.println(media[2]+ "essa é a media de historia  nesses 3"+ sistem );
                media[3] = (geo[0]+geo[1]+geo[2])/3;
                System.out.println(media[3]+ "essa é a media de geografia  nesses 3 "+ sistem );
                media[4] = (in[0]+in[1] +in[2])/3;
                System.out.println(media[4]+ "essa é a media de ingles  nesses 3 "+ sistem );
                break;
            case 4 :
                media[0] = (mat[0] + mat[1] +mat[2]+ mat[3]) /4;
                System.out.println(media[0]+ "essa é a sua media de matematica nesse 4"+sistem);
                media[1] = (port[0] + port[1] + port[2] + port[3] ) /4;
                System.out.println(media[1] + "essa é a sua media de portugues  nesses 4 "+ sistem );
                media[2] =  (his[0]+his[1] +his[2]+his[3])/4;
                System.out.println(media[2]+ "essa é a media de historia  nesses 4 "+ sistem );
                media[3] = (geo[0] +geo[1] +geo[2] + geo[3])/4;
                System.out.println(media[3]+ "essa é a media de geografia  nesses 4 "+ sistem );
                media[4]= (in[0]+in[1]+ in[2]+ in[3])/4;
                System.out.println(media[4]+ "essa é a media de ingles  nesses 4  "+ sistem );
                break;
        }
        if ((media[0] > 6)&& (media[1]>6 )&& (media[2]>6)&& (media[3] >6) && media[4] >6 ) {
            System.out.println("vc passou de ano ");
        } else {
            System.out.println("vc não passou de ano ");
        }

        sc.close();
        System.exit(0);

    }}
