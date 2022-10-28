package com.devexperto.repositories

import com.devexperto.models.Note
import com.devexperto.models.Note.Type

object NotesRepository {

    fun getAll(): List<Note> {
        val notes = (0..10).map {
            Note(
                "Title $it",
                "Description $it",
                if (it % 3 == 0) Type.AUDIO else Type.TEXT
            )
        }
        return notes
    }
}