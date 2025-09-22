package br.edu.ifsp.scl.sdm.todolist.model.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.edu.ifsp.scl.sdm.todolist.model.entity.Task

@Dao
interface TaskDao {
    companion object {
        const val TASK_TABLE = "task" //nome da tabela no banco de dados
    }
    @Insert
    fun createTask(task: Task)//vai receber a tarefa e inserir no banco de dados
    @Query("SELECT * FROM $TASK_TABLE")
    fun retrieveTasks(): List<Task> //vai retornar uma lista de tarefas
    @Update
    fun updateTask(task: Task)//vai receber a tarefa e atualizar os dados
    @Delete
    fun deleteTask(task: Task)//vai receber a tarefa e deletar os dados
}