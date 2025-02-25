/*
 * Copyright 2008-2009 MOSPA(Ministry of Security and Public Administration).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package egovframework.dev.imp.codegen.model.generator;


/**
 * 모델 기반 코드젠 인터페이스 클래스
 * <p><b>NOTE:</b> 코드젠 인터페이스. 
 * @author 개발환경 개발팀 김형조
 * @since 2009.08.10
 * @version 1.0
 * @see
 *
 * <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.08.10  김형조          최초 생성
 *
 * </pre>
 */
public interface IGenerator {
	/** 
	 * 코드젠 인터페이스 메소드
	 * 
	 * @param element
	 * @return
	 * @throws Exception
	 * 
	 */
	public String generate(Object element) throws Exception;
}
