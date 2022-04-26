/*
 * Copyright 2020-2022 dasdrolpi & gabl22
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

package de.drolpi.terminal.client;

import de.natrox.console.Console;
import de.natrox.console.jline3.JLine3Console;

public class Main {

    private Main() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) throws Exception {
        Console console = JLine3Console
            .builder()
            .prompt(() -> "> ")
            .build();

        TerminalClient client = new TerminalClient(console);
        client.start();
    }

}