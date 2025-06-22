/*
 *  This file is part of Block IDLE.
 *
 *  Block IDLE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Block IDLE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Block IDLE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.icst.blockidle.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.icst.blockidle.bean.utils.BeansUIDConstants;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;

/**
 * Represents a variable definition within the system and supports cloning.
 * <p>
 * The {@code VariableBean} class encapsulates metadata about a variable, including its access level
 * and type (e.g., a regular variable or a layout-related variable like view binding).
 * This class implements {@link CloneableBean} for deep copying and {@link Serializable} for object serialization.
 * </p>
 *
 * <p>
 * Access Modifiers:
 * <ul>
 *   <li>{@link #ACCESS_MODIFIER_PRIVATE} – {@code private}</li>
 *   <li>{@link #ACCESS_MODIFIER_PROTECTED} – {@code protected}</li>
 *   <li>{@link #ACCESS_MODIFIER_PUBLIC} – {@code public}</li>
 * </ul>
 * </p>
 *
 * <p>
 * Variable Types:
 * <ul>
 *   <li>{@link #VARIABLE} – Standard variable</li>
 *   <li>{@link #LAYOUT} – Layout-based variable, e.g., view binding</li>
 * </ul>
 * </p>
 *
 * @see CloneableBean
 * @see Serializable
 */
public class VariableBean implements CloneableBean<VariableBean>, Serializable {
	public static final long serialVersionUID = BeansUIDConstants.VARIABLE_BEAN;

	public static final int ACCESS_MODIFIER_PRIVATE = 1;
	public static final int ACCESS_MODIFIER_PROTECTED = 2;
	public static final int ACCESS_MODIFIER_PUBLIC = 3;

	public static final int VARIABLE = 0;
	public static final int LAYOUT = 1;

	private int accessModifier;
	private String variableTitle;
	private String variableName;
	private String nonFixedVariableName;
	private String variableInitializerCode;
	private DatatypeBean variableDataType;
	private boolean mustBeGloballyIntialized;
	private boolean isInitializedGlobally;
	private boolean canInitializedGlobally;
	private boolean isStaticVariable;
	private boolean isFinalVariable;
	private boolean applyColorFilter;
	private byte[] icon;
	private VariableBean[] requiredVariables;
	private HashMap<String, String> variableTitles;
	private HashMap<String, String> variableValues;
	private HashMap<String, Integer> inputType;
	private BeanManifest beanManifest;

	/**
	 * Retrieves all metadata instances of the specified type from both {@code requiredVariables}
	 * and {@code beanManifest}.
	 *
	 * <p>This method iterates through all required variables and extracts metadata of the given
	 * type. It also retrieves matching metadata from the {@code beanManifest}, if available. This
	 * ensures that the returned list includes all metadata of the specified type, collected from
	 * all relevant data sources within the object.
	 *
	 * <p>The method handles {@code null} checks on {@code beanManifest} and its metadata collection
	 * to avoid {@link NullPointerException}, covering edge cases gracefully.
	 *
	 * @param <T> the type of metadata to retrieve; must extend {@link BeanMetadata}
	 * @param classType the class object representing the metadata type to search for
	 * @return a ArrayList<T extends {@link BeanMetadata}> of all metadata entries of the specified type, or an empty list if none found
	 * @see BeanMetadata
	 * @see BeanManifest#get(Class)
	 */
	public <T extends BeanMetadata> ArrayList<T> getAllMetadata(Class<T> classType) {
		ArrayList<T> blocksMetadata = new ArrayList<T>();
		for (int i = 0; i < requiredVariables.length; ++i) {
			blocksMetadata.addAll(requiredVariables[i].getAllMetadata(classType));
		}
		if (beanManifest != null) {
			if (beanManifest.getMetadata() != null) {
				blocksMetadata.addAll(beanManifest.get(classType));
			}
		}
		return blocksMetadata;
	}

	/**
	 * Creates a deep copy of this {@code VariableBean} instance.
	 *
	 * <p>The method ensures that all primitive fields and mutable objects are duplicated properly
	 * to avoid shared references, thus preventing unintended side effects when modifying the cloned
	 * instance. Immutable or null-safe copies are made where applicable.
	 *
	 * <p>Specifically:
	 *
	 * <ul>
	 *   <li>Strings are copied using {@code new String(...)} to ensure new references.
	 *   <li>Booleans and Integers are boxed from primitives to ensure clarity and immutability.
	 *   <li>{@link DatatypeBean} is cloned recursively using its {@code cloneBean()} method.
	 *   <li>{@code requiredVariables} are deeply cloned, with each {@code VariableBean} copied
	 *       individually.
	 *   <li>{@code icon} byte array is copied using {@code System.arraycopy}.
	 *   <li>{@code variableTitles}, {@code variableValues}, and {@code inputType} are
	 *       shallow-copied using {@code new HashMap<>(...)}.
	 *   <li>{@code beanManifest} is assigned directly (TODO indicates deep cloning is intended in
	 *       the future).
	 * </ul>
	 *
	 * @return a new {@code VariableBean} instance with the same values and structure as this one
	 * @see VariableBean
	 * @see CloneableBean
	 */
	@Override
	public VariableBean cloneBean() {
		VariableBean variable = new VariableBean();
		variable.accessModifier = this.accessModifier;
		variable.variableTitle = this.variableTitle == null ? null : new String(this.variableTitle);
		variable.variableDataType = this.variableDataType == null ? null : variableDataType.cloneBean();
		variable.variableName = this.variableName == null ? null : new String(this.variableName);
		variable.mustBeGloballyIntialized = this.mustBeGloballyIntialized;
		variable.isInitializedGlobally = this.isInitializedGlobally;
		variable.canInitializedGlobally = this.canInitializedGlobally;
		variable.isStaticVariable = this.isStaticVariable;
		variable.isFinalVariable = this.isFinalVariable;
		variable.applyColorFilter = this.applyColorFilter;
		// TODO: Deep clone BeanManifest
		variable.beanManifest = this.beanManifest == null ? null : this.beanManifest;
		variable.nonFixedVariableName = this.nonFixedVariableName == null ? null
				: new String(this.nonFixedVariableName);
		variable.variableInitializerCode = this.variableInitializerCode == null ? null
				: new String(this.variableInitializerCode);

		if (this.icon == null) {
			variable.icon = null;
		} else {
			variable.icon = new byte[this.icon.length];
			System.arraycopy(this.icon, 0, variable.icon, 0, this.icon.length);
		}

		if (this.requiredVariables == null) {
			variable.requiredVariables = null;
		} else {
			variable.requiredVariables = new VariableBean[this.requiredVariables.length];
			for (int i = 0; i < this.requiredVariables.length; i++) {
				variable.requiredVariables[i] = this.requiredVariables[i] == null ? null
						: this.requiredVariables[i].cloneBean();
			}
		}

		if (this.variableTitles == null) {
			variable.variableTitles = null;
		} else {
			variable.variableTitles = new HashMap<>(this.variableTitles);
		}

		if (this.variableValues == null) {
			variable.variableValues = null;
		} else {
			variable.variableValues = new HashMap<>(this.variableValues);
		}

		if (this.inputType == null) {
			variable.inputType = null;
		} else {
			variable.inputType = new HashMap<>(this.inputType);
		}

		return variable;
	}

	/**
	 * Generates the Java source code representation for this {@code VariableBean}, including all
	 * required (dependent) variables if present.
	 *
	 * <p>This method builds a complete variable declaration with modifiers (e.g., access, static,
	 * final), data type, variable name (or non-fixed formatted name), and optionally, an
	 * initializer expression. It uses values from {@code variableValues} to replace template keys
	 * in the initializer expression.
	 *
	 * <p>If {@code requiredVariables} are present, this method recursively appends their code
	 * declarations using the overloaded {@link #getDefCode(HashMap, VariableBean)} method.
	 *
	 * <p>Template syntax keys such as {@code %{variableName}} are replaced using the {@code
	 * CodeFormatterUtils.getKeySyntaxString(String)} utility.
	 *
	 * @return the formatted Java code for the variable declaration(s)
	 * @see #getDefCode(HashMap, VariableBean)
	 * @see CodeFormatterUtils
	 */
	public String getDefCode() {
		StringBuilder code = new StringBuilder();

		if (getRequiredVariables() != null) {
			for (int i = 0; i < getRequiredVariables().length; ++i) {
				if (i != 0) {
					code.append("\n");
				}

				VariableBean variable = getRequiredVariables()[i];
				code.append(getDefCode(getVariableValues(), this));
			}

			if (getRequiredVariables().length > 0) {
				code.append("\n");
			}

			if (variableDataType == null) {
				return code.toString();
			}
		}

		String accessModifier = switch (getAccessModifier()) {
			case ACCESS_MODIFIER_PRIVATE -> "private";
			case ACCESS_MODIFIER_PROTECTED -> "protected";
			case ACCESS_MODIFIER_PUBLIC -> "public";
			default -> "";
		};

		code.append(accessModifier);
		code.append(" ");

		if (isStaticVariable) {
			code.append("static");
			code.append(" ");
		}

		if (isFinalVariable) {
			code.append("final");
			code.append(" ");
		}

		code.append(variableDataType.getClassName());
		code.append(" ");
		if (getNonFixedVariableName() == null) {
			code.append(variableName);
		} else {
			code.append(
					getNonFixedVariableName()
							.replace(CodeFormatterUtils.getKeySyntaxString("variableName"), variableName));
		}

		if (isInitializedGlobally) {
			if (getVariableInitializerCode() == null) {
				code.append(";");
			} else {
				code.append(" = ");

				String init = new String(getVariableInitializerCode());

				for (Map.Entry<String, String> entry : variableValues.entrySet()) {
					String key = entry.getKey();
					String value = entry.getValue();
					init = init.replace(CodeFormatterUtils.getKeySyntaxString(key), value);
				}

				code.append(init);
			}
			code.append(";");
		} else {
			code.append(";");
		}

		return code.toString();
	}

	/**
	 * Generates a single-line Java variable declaration for this {@code VariableBean}, formatted
	 * based on current modifiers, type, and name, and replaces any template syntax in the
	 * initializer using the provided variable values.
	 *
	 * <p>This method is internally used for generating code for nested or required variables by the
	 * main {@link #getDefCode()} method.
	 *
	 * <p>Key behaviors include:
	 *
	 * <ul>
	 *   <li>Modifier resolution via {@code getAccessModifier()}.
	 *   <li>Uses either {@code variableName} or a formatted {@code nonFixedVariableName}.
	 *   <li>If the variable is globally initialized and has initializer code, it will substitute
	 *       variable placeholders using {@code variableValues}.
	 *   <li>Returns a complete declaration ending in a semicolon.
	 * </ul>
	 *
	 * @param variableValues map of key-value replacements used for variable initializer template
	 * @param parentVariableModel the parent {@code VariableBean}, used for context (currently
	 *     unused)
	 * @return the generated Java variable declaration as a string
	 */
	private String getDefCode(
			HashMap<String, String> variableValues, VariableBean parentVariableModel) {
		StringBuilder code = new StringBuilder();

		String accessModifier = switch (getAccessModifier()) {
			case ACCESS_MODIFIER_PRIVATE -> "private";
			case ACCESS_MODIFIER_PROTECTED -> "protected";
			case ACCESS_MODIFIER_PUBLIC -> "public";
			default -> "";
		};

		code.append(accessModifier);
		code.append(" ");

		if (isStaticVariable) {
			code.append("static");
			code.append(" ");
		}

		if (isFinalVariable) {
			code.append("final");
			code.append(" ");
		}

		code.append(variableDataType.getClassName());
		code.append(" ");
		if (getNonFixedVariableName() == null) {
			code.append(variableName);
		} else {
			code.append(
					getNonFixedVariableName()
							.replace(CodeFormatterUtils.getKeySyntaxString("variableName"), variableName));
		}

		if (isInitializedGlobally) {
			if (getVariableInitializerCode() == null) {
				code.append(";");
			} else {
				code.append(" = ");

				String init = new String(getVariableInitializerCode());

				for (Map.Entry<String, String> entry : variableValues.entrySet()) {
					String key = entry.getKey();
					String value = entry.getValue();
					init = init.replace(CodeFormatterUtils.getKeySyntaxString("variable"), value);
				}

				code.append(init);
			}
			code.append(";");
		} else {
			code.append(";");
		}

		return code.toString();
	}

	/**
	* Returns the access modifier of the variable (e.g., private, protected, public).
	*
	* @return the access modifier as an integer constant
	*/
	public int getAccessModifier() {
		return this.accessModifier;
	}

	/**
	 * Sets the access modifier of the variable.
	 *
	 * @param accessModifier the access modifier constant to set
	 */
	public void setAccessModifier(int accessModifier) {
		this.accessModifier = accessModifier;
	}

	/**
	 * Returns the human-readable title of the variable.
	 *
	 * @return the variable title
	 */
	public String getVariableTitle() {
		return this.variableTitle;
	}

	/**
	 * Sets the human-readable title of the variable.
	 *
	 * @param variableTitle the title to set
	 */
	public void setVariableTitle(String variableTitle) {
		this.variableTitle = variableTitle;
	}

	/**
	 * Returns the data type of the variable.
	 *
	 * @return the {@link DatatypeBean} representing the variable's type
	 */
	public DatatypeBean getVariableDataType() {
		return this.variableDataType;
	}

	/**
	 * Sets the data type of the variable.
	 *
	 * @param variableDataType the {@link DatatypeBean} to set
	 */
	public void setVariableDataType(DatatypeBean variableDataType) {
		this.variableDataType = variableDataType;
	}

	/**
	 * Returns the variable's identifier name.
	 *
	 * @return the variable name
	 */
	public String getVariableName() {
		return this.variableName;
	}

	/**
	 * Sets the variable's identifier name.
	 *
	 * @param variableName the variable name to set
	 */
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	/**
	 * Returns the variable name template used when generating formatted names.
	 *
	 * @return the non-fixed variable name format string
	 */
	public String getNonFixedVariableName() {
		return this.nonFixedVariableName;
	}

	/**
	 * Sets the template for generating non-fixed variable names.
	 *
	 * @param nonFixedVariableName the format string to set
	 */
	public void setNonFixedVariableName(String nonFixedVariableName) {
		this.nonFixedVariableName = nonFixedVariableName;
	}

	/**
	 * Returns the code used to initialize the variable.
	 *
	 * @return the variable initializer code, or {@code null} if none
	 */
	public String getVariableInitializerCode() {
		return this.variableInitializerCode;
	}

	/**
	 * Sets the code used to initialize the variable.
	 *
	 * @param variableInitializerCode the initializer code to set
	 */
	public void setVariableInitializerCode(String variableInitializerCode) {
		this.variableInitializerCode = variableInitializerCode;
	}

	/**
	 * Returns whether the variable must be initialized globally at the top level.
	 *
	 * @return {@code true} if it must be initialized globally, otherwise {@code false}
	 */
	public boolean getMustBeGloballyIntialized() {
		return this.mustBeGloballyIntialized;
	}

	/**
	 * Sets whether the variable must be initialized globally.
	 *
	 * @param mustBeGloballyIntialized whether it must be globally initialized
	 */
	public void setMustBeGloballyIntialized(boolean mustBeGloballyIntialized) {
		this.mustBeGloballyIntialized = mustBeGloballyIntialized;
	}

	/**
	 * Returns whether the variable is currently initialized globally.
	 *
	 * @return {@code true} if it is globally initialized, otherwise {@code false}
	 */
	public boolean getIsInitializedGlobally() {
		return this.isInitializedGlobally;
	}

	/**
	 * Sets whether the variable is initialized globally.
	 *
	 * @param isInitializedGlobally the global initialization status
	 */
	public void setIsInitializedGlobally(boolean isInitializedGlobally) {
		this.isInitializedGlobally = isInitializedGlobally;
	}

	/**
	 * Returns whether the variable can be initialized globally.
	 *
	 * @return {@code true} if it can be initialized globally, otherwise {@code false}
	 */
	public boolean getCanInitializedGlobally() {
		return this.canInitializedGlobally;
	}

	/**
	 * Sets whether the variable can be initialized globally.
	 *
	 * @param canInitializedGlobally whether it can be globally initialized
	 */
	public void setCanInitializedGlobally(boolean canInitializedGlobally) {
		this.canInitializedGlobally = canInitializedGlobally;
	}

	/**
	 * Returns whether the variable is declared as {@code static}.
	 *
	 * @return {@code true} if static, otherwise {@code false}
	 */
	public boolean getIsStaticVariable() {
		return this.isStaticVariable;
	}

	/**
	 * Sets whether the variable is declared as {@code static}.
	 *
	 * @param isStaticVariable whether it is static
	 */
	public void setIsStaticVariable(boolean isStaticVariable) {
		this.isStaticVariable = isStaticVariable;
	}

	/**
	 * Returns whether the variable is declared as {@code final}.
	 *
	 * @return {@code true} if final, otherwise {@code false}
	 */
	public boolean getIsFinalVariable() {
		return this.isFinalVariable;
	}

	/**
	 * Sets whether the variable is declared as {@code final}.
	 *
	 * @param isFinalVariable whether it is final
	 */
	public void setIsFinalVariable(boolean isFinalVariable) {
		this.isFinalVariable = isFinalVariable;
	}

	/**
	 * Returns the icon representing this variable, if any.
	 *
	 * @return a byte array of the icon image data
	 */
	public byte[] getIcon() {
		return this.icon;
	}

	/**
	 * Sets the icon representing this variable.
	 *
	 * @param icon the byte array of the icon image data
	 */
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}

	/**
	 * Returns the list of dependent or required variables.
	 *
	 * @return an array of {@code VariableBean} objects
	 */
	public VariableBean[] getRequiredVariables() {
		return this.requiredVariables;
	}

	/**
	 * Sets the list of dependent or required variables.
	 *
	 * @param requiredVariables an array of {@code VariableBean} to set
	 */
	public void setRequiredVariables(VariableBean[] requiredVariables) {
		this.requiredVariables = requiredVariables;
	}

	/**
	 * Returns the localized or alternate titles of the variable.
	 *
	 * @return a map of language codes or keys to title strings
	 */
	public HashMap<String, String> getVariableTitles() {
		return this.variableTitles;
	}

	/**
	 * Sets the localized or alternate titles of the variable.
	 *
	 * @param variableTitles a map of title values
	 */
	public void setVariableTitles(HashMap<String, String> variableTitles) {
		this.variableTitles = variableTitles;
	}

	/**
	 * Returns the value substitutions for this variable, used during code generation.
	 *
	 * @return a map of placeholder keys to actual string values
	 */
	public HashMap<String, String> getVariableValues() {
		return this.variableValues;
	}

	/**
	 * Sets the value substitutions for this variable.
	 *
	 * @param variableValues a map of value replacements
	 */
	public void setVariableValues(HashMap<String, String> variableValues) {
		this.variableValues = variableValues;
	}

	/**
	 * Returns the input type configuration for variable editor UI or interpretation.
	 *
	 * @return a map of input field keys to input type constants
	 */
	public HashMap<String, Integer> getInputType() {
		return this.inputType;
	}

	/**
	 * Sets the input type configuration for variable editors.
	 *
	 * @param inputType a map of input types
	 */
	public void setInputType(HashMap<String, Integer> inputType) {
		this.inputType = inputType;
	}

	/**
	 * Returns whether a color filter should be applied to this variable in the UI.
	 *
	 * @return {@code true} if a color filter is applied, otherwise {@code false}
	 */
	public boolean getApplyColorFilter() {
		return this.applyColorFilter;
	}

	/**
	 * Sets whether a color filter should be applied to this variable in the UI.
	 *
	 * @param applyColorFilter whether to apply a color filter
	 */
	public void setApplyColorFilter(boolean applyColorFilter) {
		this.applyColorFilter = applyColorFilter;
	}

	/**
	 * Returns the {@link BeanManifest} that holds additional metadata about this variable.
	 *
	 * @return the associated {@code BeanManifest}, or {@code null} if not set
	 */
	public BeanManifest getBeanManifest() {
		return this.beanManifest;
	}

	/**
	 * Sets the {@link BeanManifest} containing metadata for this variable.
	 *
	 * @param beanManifest the manifest to associate with this variable
	 */
	public void setBeanManifest(BeanManifest beanManifest) {
		this.beanManifest = beanManifest;
	}
}
