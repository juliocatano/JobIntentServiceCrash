package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService10 : BaseCrashJobService() {
    companion object {
        private const val ID = 82322

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService10::class.java,
                ID
            )
        }
    }
}