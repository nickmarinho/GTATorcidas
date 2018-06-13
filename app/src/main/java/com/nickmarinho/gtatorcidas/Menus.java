package com.nickmarinho.gtatorcidas

import android.content.Context
import org.json.JSONException
import org.json.JSONObject

class Menus {
    companion object {
        val torcidasFile = "torcidas.json"

        fun getTorcidas(context: Context): ArrayList<Education> {
            val educationsList = ArrayList<Education>()

            try {
                // Load data
                val jsonString = loadJsonFromAsset(educationsFile, context)
                val json = JSONObject(jsonString)
                val menu = json.getJSONArray("educations")

                // Get Recipe objects from data
                (0 until menu.length()).mapTo(educationsList) {
                    Education(
                            menu.getJSONObject(it).getString("id"),
                            menu.getJSONObject(it).getString("title"),
                            menu.getJSONObject(it).getString("image"),
                            menu.getJSONObject(it).getString("description")
                    )
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return educationsList
        }

        fun getEducation(id: String, context: Context): ArrayList<Education> {
            val educationItem = ArrayList<Education>()

            try {
                val jsonString = loadJsonFromAsset(educationsFile, context)
                val json = JSONObject(jsonString)

                Education(
                        json.getJSONObject(id).getString("id"),
                        json.getJSONObject(id).getString("title"),
                        json.getJSONObject(id).getString("image"),
                        json.getJSONObject(id).getString("description")
                )
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return educationItem
        }

        fun getSeries(context: Context): ArrayList<Serie> {
            val serieList = ArrayList<Serie>()

            try {
                // Load data
                val jsonString = loadJsonFromAsset(seriesFile, context)
                val json = JSONObject(jsonString)
                val menu = json.getJSONArray("series")

                // Get Recipe objects from data
                (0 until menu.length()).mapTo(serieList) {
                    Serie(
                            menu.getJSONObject(it).getString("id"),
                            menu.getJSONObject(it).getString("id_education"),
                            menu.getJSONObject(it).getString("title"),
                            menu.getJSONObject(it).getString("image")
                    )
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return serieList
        }

        fun getSerie(id: String, context: Context): ArrayList<Serie> {
            val serieItem = ArrayList<Serie>()

            try {
                val jsonString = loadJsonFromAsset(seriesFile, context)
                val json = JSONObject(jsonString)

                Serie(
                        json.getJSONObject(id).getString("id"),
                        json.getJSONObject(id).getString("id_education"),
                        json.getJSONObject(id).getString("title"),
                        json.getJSONObject(id).getString("image")
                )
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return serieItem
        }

        fun getMaterias(context: Context): ArrayList<Materia> {
            val materiaList = ArrayList<Materia>()

            try {
                // Load data
                val jsonString = loadJsonFromAsset(materiasFile, context)
                val json = JSONObject(jsonString)
                val menu = json.getJSONArray("materias")

                // Get Recipe objects from data
                (0 until menu.length()).mapTo(materiaList) {
                    Materia(
                            menu.getJSONObject(it).getString("id"),
                            menu.getJSONObject(it).getString("id_education"),
                            menu.getJSONObject(it).getString("id_serie"),
                            menu.getJSONObject(it).getString("title"),
                            menu.getJSONObject(it).getString("image")
                    )
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return materiaList
        }

        fun getMateria(id: String, context: Context): ArrayList<Materia> {
            val materiaItem = ArrayList<Materia>()

            try {
                val jsonString = loadJsonFromAsset(materiasFile, context)
                val json = JSONObject(jsonString)

                Materia(
                        json.getJSONObject(id).getString("id"),
                        json.getJSONObject(id).getString("id_education"),
                        json.getJSONObject(id).getString("id_serie"),
                        json.getJSONObject(id).getString("title"),
                        json.getJSONObject(id).getString("image")
                )
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return materiaItem
        }

        fun getLessons(context: Context): ArrayList<Lesson> {
            val lessonList = ArrayList<Lesson>()

            try {
                // Load data
                val jsonString = loadJsonFromAsset(lessonsFile, context)
                val json = JSONObject(jsonString)
                val menu = json.getJSONArray("lessons")

                // Get Recipe objects from data
                (0 until menu.length()).mapTo(lessonList) {
                    Lesson(
                            menu.getJSONObject(it).getString("id"),
                            menu.getJSONObject(it).getString("id_education"),
                            menu.getJSONObject(it).getString("id_serie"),
                            menu.getJSONObject(it).getString("id_materia"),
                            menu.getJSONObject(it).getString("title"),
                            menu.getJSONObject(it).getString("image"),
                            menu.getJSONObject(it).getString("answer")
                    )
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return lessonList
        }

        fun getLesson(id: String, context: Context): ArrayList<Lesson> {
            val lessonItem = ArrayList<Lesson>()

            try {
                val jsonString = loadJsonFromAsset(lessonsFile, context)
                val json = JSONObject(jsonString)

                Lesson(
                        json.getJSONObject(id).getString("id"),
                        json.getJSONObject(id).getString("id_education"),
                        json.getJSONObject(id).getString("id_serie"),
                        json.getJSONObject(id).getString("id_materia"),
                        json.getJSONObject(id).getString("title"),
                        json.getJSONObject(id).getString("image"),
                        json.getJSONObject(id).getString("answer")
                )
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return lessonItem
        }

        private fun loadJsonFromAsset(filename: String, context: Context): String? {
                var json: String? = null

        try {
            val inputStream = context.assets.open(filename)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charsets.UTF_8)
        } catch (ex: java.io.IOException) {
            ex.printStackTrace()
            return null
        }

        return json
        }
    }
}