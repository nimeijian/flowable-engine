/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.test.el;

import static org.assertj.core.api.Assertions.assertThat;

import org.flowable.cmmn.engine.impl.function.IsStageCompletableExpressionFunction;
import org.junit.Test;

/**
 * @author Joram Barrez
 */
public class IsStageCompletableExpressionEnhancerTest {

    private IsStageCompletableExpressionFunction expressionFunction = new IsStageCompletableExpressionFunction();

    @Test
    public void testRegexDefault() {
        assertRegexCorrect("${cmmn:isStageCompletable()}", "${cmmn:isStageCompletable(planItemInstance)}");
    }

    public void assertRegexCorrect(String in, String out) {
        assertThat(expressionFunction.enhance(in)).isEqualTo(out);
    }

}
