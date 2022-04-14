public class vacuum_control {

    public String move(int X, int Y, String Orientation, String Instructions){
        int X_new = X;
        int Y_new = Y;
        int Orientation_new = 0;
        for(char Char : Instructions.toCharArray()){
            if(Char == 'D' || Char == 'G'){
                Orientation_new = change_orientation(Char, Orientation_new);
            }else if (Char == 'A'){
                switch(Orientation_new){
                    case 0:
                        Y_new += 1;
                        break;
                    case 1:
                        X_new += 1;
                        break;
                    case 2:
                        Y_new -= 1;
                        break;
                    case 3:
                        X_new -= 1;
                        break;
                    default:
                        return "error";
                }
            }else{
                return "error";
            }
        }
        return "x=" + X_new + " y=" + Y_new + " orientation=" + get_orientation(Orientation_new);
    }

    private int change_orientation(char Action, int Current_orientation){
        if(Action == 'D' && Current_orientation == 3){
                return 0;
        }else if(Action == 'D'){
            return Current_orientation + 1;
        } else if(Action == 'G' && Current_orientation == 0){
                return 3;
        }else{
                return Current_orientation - 1;
            }
    }

    private String get_orientation(int Orientation){
        if(Orientation == 0) {
            return "N";
        }else if(Orientation == 1) {
            return "E";
        }else if(Orientation == 2) {
            return "S";
        }else{
            return "W";
        }
    }
}
