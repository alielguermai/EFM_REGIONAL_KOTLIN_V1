fun main(args: Array<String>) {

}

fun String.acronym(): String {
    var resultat=""
    for (x in this.split(" ")){
        resultat+=x[0].uppercase()
    }
    return resultat
}

fun String.isEmptyOrBlank(): Boolean {
    return this.isEmpty() || this.trim().isEmpty()
}
