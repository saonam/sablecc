/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
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
package back;

import back.macro.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(
            String[] args){

        System.out.print("======== Main Test ===========\n");
        Macros m = new Macros();
        MA ma = m.newA();
        ma.addX("First argument of MA");
        List<Macro> macros = new ArrayList<>();
        MB mb = m.newB();
        mb.addO("la");
        MB mb2 = m.newB();
        mb2.addO("First argument in MB0");
        macros.add(mb2);
        MB mb3 = m.newB();
        MB mb4 = m.newB();
        macros.add(mb3);
        macros.add(mb4);

        mb3.addO("First argument in MB1");
        mb4.addO("First argument in MB2");

        try{
            mb.addS(m.newC());
            ma.addZ(m.newC());
            ma.addY(mb);
            ma.addZ(m.newC());
            mb2.addS(m.newC());
            System.out.println(ma.build());
        }
        catch(ObjectMacroException e){
            System.err.println(e.getMessage());
            System.err.println("It should not throw an exception");
            System.exit(1);
        }
    }
}
