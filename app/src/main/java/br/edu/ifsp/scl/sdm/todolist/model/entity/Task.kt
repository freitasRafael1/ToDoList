package br.edu.ifsp.scl.sdm.todolist.model.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity //ja marcada para fazer a persistencia room
data class Task (
    @PrimaryKey
    var time: Long = INVALID_TIME,
    var name: String = "",
    var done: Int = TASK_DONE_FALSE //tarefa realizado ou nao
): Parcelable {
    companion object {
        const val INVALID_TIME = -1L
        const val TASK_DONE_TRUE = 1
        const val TASK_DONE_FALSE = 0
    }
}