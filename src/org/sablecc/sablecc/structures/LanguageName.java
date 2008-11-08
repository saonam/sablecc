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

package org.sablecc.sablecc.structures;

import org.sablecc.sablecc.exception.InternalException;
import org.sablecc.sablecc.syntax3.node.ALanguageName;
import org.sablecc.sablecc.syntax3.node.Token;

public class LanguageName
        implements Name {

    private final ALanguageName declaration;

    private final String nameString;

    private final Token nameToken;

    LanguageName(
            ALanguageName declaration) {

        if (declaration == null) {
            throw new InternalException("declaration may not be null");
        }

        this.declaration = declaration;
        this.nameString = declaration.getIdentifier().getText();
        this.nameToken = declaration.getIdentifier();
    }

    public ALanguageName getDeclaration() {

        return this.declaration;
    }

    public String getNameString() {

        return this.nameString;
    }

    public Token getNameToken() {

        return this.nameToken;
    }
}
