public class SwitchCase {
    public static void main(String[] args){
     int diaDasemana=4;
     String nomeDoDia;
     switch (diaDasemana) {
        case 1:nomeDoDia="Domingo";break;
        case 2:nomeDoDia="Segunda";break;
        case 3:nomeDoDia="Terca";break;
        case 4:nomeDoDia="Quarta";break;
        case 5:nomeDoDia="Quinta";break;
        case 6:nomeDoDia="Sexta";break;
        case 7:nomeDoDia="Sabado";break;
        default:nomeDoDia="Dia invalido";
        
     
    }
    System.out.println(nomeDoDia);
}
    
}
