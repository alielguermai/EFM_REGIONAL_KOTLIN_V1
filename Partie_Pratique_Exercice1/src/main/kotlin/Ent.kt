import java.io.IOException

class Ent(var ang : String,var fr : String) {
    init {
        if (ang.isEmptyOrBlank() || fr.isEmptyOrBlank())
            throw IOException("Les deux mots ne peuvent pas etre ni empty ni blank.")
    }

    override fun toString(): String {
        return "Ent(ang='$ang': fr='$fr')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ent) return false

        if (ang != other.ang) return false

        return true
    }


}
