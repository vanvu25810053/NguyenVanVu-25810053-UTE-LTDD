package edu.hcmute.buoi_06.data

import edu.hcmute.buoi_06.model.Affirmation
import edu.hcmute.buoi_06.R

class Datasource(){
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.images),
            Affirmation(R.string.affirmation2, R.drawable.images),
            Affirmation(R.string.affirmation3, R.drawable.images),
            Affirmation(R.string.affirmation4, R.drawable.images),
            Affirmation(R.string.affirmation5, R.drawable.images),
            Affirmation(R.string.affirmation6, R.drawable.images),
            Affirmation(R.string.affirmation7, R.drawable.images),
            Affirmation(R.string.affirmation8, R.drawable.images),
            Affirmation(R.string.affirmation9, R.drawable.images),
            Affirmation(R.string.affirmation10, R.drawable.images)
        )
    }
}