import java.io.IOException

class Dict {
    var liste = ArrayList<Ent>()
    fun nombreEntrees() : Int{
        return liste.size
    }
    fun ajouter(e : Ent){
        if (liste.contains(e))
            throw IOException("L'entree appartient deja au dictionnariel")
        liste.add(e)
    }
    fun supprimer(e : Ent) : Boolean{
        try {
            liste.remove(e)
            return true
        }catch (e : Exception){
            return false
        }
    }
    fun supprimer(motAnglais : String) : Boolean{
        for (x in liste){
            if (x.ang==motAnglais) {
                liste.remove(x)
                return true
            }
        }
        return false
    }
    fun frAn(motFrancais : String) : ArrayList<String>{
        var resultat = ArrayList<String>()
        for (x in liste){
            if (x.fr==motFrancais)
                resultat.add(x.ang)
        }
        return resultat
    }
    fun motsFrancais() : ArrayList<String>{
        var resultat_sans_doublans = HashSet<String>()
        for (x in liste){
            resultat_sans_doublans.add(x.fr)
        }
        var resultat = ArrayList<String>()
        for (x in resultat_sans_doublans){
            resultat.add(x)
        }
        return resultat
    }
    fun dictionnaireFrAn() : Map<String, ArrayList<String>>{
        var resultat = HashMap<String, ArrayList<String>>()
        for (x in this.motsFrancais()){
            resultat.put(x,frAn(x))
        }
        return resultat
    }

    override fun toString(): String {
        return this.dictionnaireFrAn().toString()
    }

}
