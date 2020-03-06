
public class Surface {
    int ligne;
    int colonne;
    Forme [] listeForme ;
    char [][] canevas ;


    public Surface(int ligne, int colonne){
        this.ligne = ligne;
        this.colonne = colonne;
        this.canevas = new char[ligne][colonne];
        this.listeForme = new Forme[0];
        for (int i = 0; i < canevas.length; i++) {
            for (int j = 0; j < canevas[i].length; j++) {
                this.canevas[i][j] = ' ';

            }
        }
    }


    public void setCanevasPoint(char car, int i ,int j) {
        this.canevas[i][j] = car;
    }

    public char[][] getCanevas(){

        return this.canevas;
    }

    public void ajouter (Forme enforme){

        enforme.dessiner(this);
    }

    public void brasser(){
    }

    public void renverser(){
    }

}
