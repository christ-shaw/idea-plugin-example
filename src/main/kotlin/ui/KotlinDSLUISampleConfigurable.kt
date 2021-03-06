/*
 * Copyright 2020 Nazmul Idris. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ui

import ColorConsoleContext.Companion.colorConsole
import Colors
import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.ui.DialogPanel

/**
 * This application level configurable shows up the in IDE Preferences UI.
 */
class KotlinDSLUISampleConfigurable : BoundConfigurable("Kotlin UI DSL") {
  override fun apply() {
    colorConsole {
      printLine {
        span(Colors.Green, "KotlinDSLUISampleConfigurable apply() called")
      }
    }
    super.apply()
  }

  override fun cancel() {
    colorConsole {
      printLine {
        span(Colors.Green, "KotlinDSLUISampleConfigurable cancel() called")
      }
    }
    super.cancel()
  }

  /** When the form is changed by the user, this returns `true` and enables the "Apply" button. */
  override fun isModified(): Boolean {
    colorConsole {
      printLine {
        span(Colors.Green, "KotlinDSLUISampleConfigurable isModified() called")
        span(Colors.Blue, "return ${super.isModified()}")
      }
    }
    return super.isModified()
  }

  override fun reset() {
    colorConsole {
      printLine {
        span(Colors.Green, "KotlinDSLUISampleConfigurable reset() called")
      }
    }
    super.reset()
  }

  override fun createPanel(): DialogPanel = createDialogPanel()
}