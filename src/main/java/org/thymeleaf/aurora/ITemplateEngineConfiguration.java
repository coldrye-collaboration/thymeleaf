/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora;

import java.util.List;
import java.util.Set;

import org.thymeleaf.aurora.dialect.IDialect;
import org.thymeleaf.aurora.engine.AttributeDefinitions;
import org.thymeleaf.aurora.engine.ElementDefinitions;
import org.thymeleaf.aurora.engine.ITemplateHandler;
import org.thymeleaf.aurora.processor.cdatasection.ICDATASectionProcessor;
import org.thymeleaf.aurora.processor.comment.ICommentProcessor;
import org.thymeleaf.aurora.processor.doctype.IDocTypeProcessor;
import org.thymeleaf.aurora.processor.element.IElementProcessor;
import org.thymeleaf.aurora.processor.processinginstruction.IProcessingInstructionProcessor;
import org.thymeleaf.aurora.processor.text.ITextProcessor;
import org.thymeleaf.aurora.processor.xmldeclaration.IXMLDeclarationProcessor;
import org.thymeleaf.aurora.templatemode.TemplateMode;
import org.thymeleaf.aurora.text.ITextRepository;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface ITemplateEngineConfiguration {

    // Cannot be null
    public Set<DialectConfiguration> getDialectConfigurations();

    // Cannot be null
    public Set<IDialect> getDialects();

    // Might be null if no standard dialect has been registered
    public String getStandardDialectPrefix();

    // Cannot be null
    public ITextRepository getTextRepository();

    // Cannot be null
    public ElementDefinitions getElementDefinitions();

    // Cannot be null
    public AttributeDefinitions getAttributeDefinitions();

    public Set<ICDATASectionProcessor> getCDATASectionProcessors(final TemplateMode templateMode);

    public Set<ICommentProcessor> getCommentProcessors(final TemplateMode templateMode);

    public Set<IDocTypeProcessor> getDocTypeProcessors(final TemplateMode templateMode);

    public Set<IElementProcessor> getElementProcessors(final TemplateMode templateMode);

    public Set<ITextProcessor> getTextProcessors(final TemplateMode templateMode);

    public Set<IProcessingInstructionProcessor> getProcessingInstructionProcessors(final TemplateMode templateMode);

    public Set<IXMLDeclarationProcessor> getXMLDeclarationProcessors(final TemplateMode templateMode);

    public List<Class<? extends ITemplateHandler>> getPreProcessors();

    public List<Class<? extends ITemplateHandler>> getPostProcessors();

}
