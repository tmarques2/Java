# from langchain_core.messages import HumanMessage
# from src.llm.azure_llm import create_azure_llm

# def main():
#     # Cria a LLM
#     llm = create_azure_llm()

#     # Exemplo de uso
#     prompt = "Explique machine learning de forma simples"
#     msg = HumanMessage(content=prompt)
    
#     # Usar .invoke() com a mensagem
#     resp = llm.invoke([msg])
#     print(resp.content)

# if __name__ == "__main__":
#     main()


# from langchain_core.messages import HumanMessage
# from src.llm.azure_llm import create_azure_llm
# from pdf_extractor.extractor import PDFExtractor
# import os

# def main():
#     # Extração de PDF
#     pdf_filename = "carta465.pdf"
#     pdf_path = os.path.join(os.path.dirname(__file__), '..', 'pdfs', pdf_filename)
#     print(pdf_path)
    
#     # Extração simples
#     print("--- Extração Simples ---")
#     textos = PDFExtractor.extract_text_simple(pdf_path)
#     # print(textos)
#     for i, texto in enumerate(textos, 1):
#         print(f"Página {i}: {texto[:200]}...")  # Primeiros 200 caracteres
    
#     # Extração com metadados
#     print("\n--- Extração com Metadados ---")
#     documentos = PDFExtractor.extract_text_with_metadata(pdf_path)
#     for doc in documentos:
#         print(f"Página: {doc['metadata'].get('page', 'N/A')}")
#         print(f"Conteúdo: {doc['content'][:100].get('content', "Texto não encontrado")}")

from langchain_core.messages import HumanMessage
from src.llm.azure_llm import create_azure_llm
from pdf_extractor.extractor import PDFExtractor
import os

def main():
    # Extração de PDF
    pdf_filename = "carta465.pdf"
    pdf_path = os.path.join(os.path.dirname(__file__), '..', 'pdfs', pdf_filename)
    # print(pdf_path)
    
    # Extração simples
    print("--- Extração Simples ---")
    textos = PDFExtractor.extract_text_simple(pdf_path)
    # print(textos)
    for i, texto in enumerate(textos, 1):
        print(f"Página {i}: {texto[:200]}...")  # Primeiros 200 caracteres
    
    # Extração com metadados
    print("\n--- Extração com Metadados ---")
    documentos = PDFExtractor.extract_text_with_metadata(pdf_path)
    for doc in documentos:
        # Depuração: verificar o conteúdo completo do doc
        print(f"Página: {doc}")
        
        # Tentar acessar os metadados ou outras propriedades possíveis
        if hasattr(doc, 'metadata'):
            print(f"Metadados: {doc.metadata}")
        else:
            print("Metadados não encontrados ou propriedade diferente.")
        
        # Exibir conteúdo de 'content' de forma segura
        # print(f"Conteúdo: {doc['content'][:100]}...")

    
    # Exemplo de uso da LLM com texto do PDF
    print("\n--- Análise com LLM ---")
    llm = create_azure_llm()
    
    # Use o primeiro texto extraído como prompt
    if textos:
        prompt = f"Identifique os dados de licenciamentos de veículos em relação a Dezembro de 2024 no texto a seguir e apresente-os de forma clara: {textos[0][:1000]}"
        mensagem = HumanMessage(content=prompt)
        resposta = llm.invoke([mensagem])
        print("Dados de licenciamentos extraídos:")
        print(resposta.content)


if __name__ == "__main__":
    main()
