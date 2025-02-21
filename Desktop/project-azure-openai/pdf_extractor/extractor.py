# from langchain_community.document_loaders import PyPDFLoader, UnstructuredPDFLoader
# from typing import List, Dict
# import re

# class PDFExtractor:
#     @staticmethod
#     def extract_text_simple(pdf_path: str) -> List[str]:
#         """
#         Extração simples de texto de PDF
#         """
#         try:
#             loader = PyPDFLoader(pdf_path)
#             documentos = loader.load()
#             return [doc.page_content for doc in documentos]
#         except Exception as e:
#             print(f"Erro ao extrair texto simples: {e}")
#             return []
    
#     @staticmethod
#     def extract_text_with_metadata(pdf_path: str) -> List[Dict]:
#         """
#         Extração de texto com metadados
#         """
#         loader = UnstructuredPDFLoader(pdf_path)
#         documentos = loader.load()
        
#         return [
#             {
#                 "content": doc.page_content, 
#                 "metadata": doc.metadata
#             } for doc in documentos
#         ]

# import fitz  # PyMuPDF
# from typing import List, Dict

# class PDFExtractor:
#     @staticmethod
#     def extract_text_simple(pdf_path: str) -> List[str]:
#         """
#         Extração simples de texto de PDF usando PyMuPDF
#         """
#         # Abrir o PDF
#         doc = fitz.open(pdf_path)
        
#         # Extrair texto de todas as páginas
#         texto = []
#         for page in doc:
#             texto.append(page.get_text())

#         return texto
    
#     @staticmethod
#     def extract_text_with_metadata(pdf_path: str) -> List[Dict]:
#         """
#         Extração de texto com metadados usando PyMuPDF
#         """
#         # Abrir o PDF
#         doc = fitz.open(pdf_path)
        
#         # Extrair texto e metadados
#         documentos = []
#         for page in doc:
#             documentos.append({
#                 "content": page.get_text(),
#                 "metadata": page.metadata
#             })
        
#         return documentos

import fitz  # PyMuPDF
from typing import List, Dict

class PDFExtractor:
    @staticmethod
    def extract_text_simple(pdf_path: str) -> List[str]:
        """
        Extração simples de texto de PDF usando PyMuPDF
        """
        # Abrir o PDF
        doc = fitz.open(pdf_path)
        
        # Extrair texto de todas as páginas
        texto = []
        for page in doc:
            texto.append(page.get_text())

        return texto
    
    @staticmethod
    def extract_text_with_metadata(pdf_path: str) -> List[Dict]:
        """
        Extração de texto com metadados usando PyMuPDF
        """
        # Abrir o PDF
        doc = fitz.open(pdf_path)
        
        # Extrair texto e metadados do documento (não da página)
        documentos = []
        doc_metadata = doc.metadata  # Metadados do documento inteiro
        
        for page in doc:
            documentos.append({
                "content": page.get_text(),
                "metadata": doc_metadata  # Usar os metadados do documento para todas as páginas
            })
        
        return documentos
