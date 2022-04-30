/*
 * Copyright 2022 dasdrolpi & gabl22
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

import de.drolpi.terminal.client.connection.AutoReconnectThread;
import de.drolpi.terminal.client.connection.Client;

import java.io.IOException;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) throws Exception {
        Client client = Client.create("127.0.0.1", 8888);
        AutoReconnectThread thread = new AutoReconnectThread(client);
        thread.start();
    }
}
